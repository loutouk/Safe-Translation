# Safe-Translation

## Build instructions

`git clone https://github.com/loutouk/Safe-Translation.git`

`cd Safe-Translation`

`mvn compile`

`cd target/classes/`

`java Translator ../../codeToTranslate.txt`

## Usage

The test_vulnerable function will not behave properly when used with the opponent function. We can use the Translator program to translate the test_vulnerable function so that the Ocaml program detects and prevents the vulnerability resulting of the use of the exception in the opponent function.

```ocaml
let test_vulnerable f =
   let x = ref 0 in x := 0; f (); x := 1; f (); !x;;

let opponent () =
   let c = ref 0 in
   test_vulnerable 
      (fun _ -> 
         if !c = 0
         then c := !c + 1
         else try begin test_vulnerable(fun _ -> raise (Error)); () end
              with Error -> ());;

opponent ();;
```

With the test_vulnerable function given to the Translator as input, it outputs this function translated and its associated functions. We can now detect vulnerabilities introduced by exceptions and reentrant calls at runtime.

```ocaml
exception Error ;;

let stack = ref [] ;;

let id = ref 0 ;;

let generateId () = let x = !id in id := !id + 1 ; x ;;

let pushId localId = stack := localId::!stack ;;

let popId () =
   begin match !stack with
   | [] -> failwith "Error, empty stack!"
   | hd::tl -> stack := tl
   end
   
let checkId localId =
   begin match !stack with
   | [] -> failwith "Error, stack id mismatch!"
   | hd::_ -> if hd != localId then failwith "Error, stack id mismatch!"
   end
   
let test_translated f = let x = ref 0 in 
	let id1 = generateId () in pushId id1 ; 
	x := 0; f () ; checkId id1; x := 1; f () ; checkId id1; !x ; popId () ;;

let opponent () =
   let c = ref 0 in
   test_translated (fun _ -> if !c = 0
                           then c := !c + 1
                           else  try begin test_translated(fun _ -> raise (Error)); () end
                                 with Error -> ());;

opponent ();;
```