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

let test_vulnerable f =
   let x = ref 0 in x := 0; f (); x := 1; f (); !x;;

let test_translated f = let x = ref 0 in let return_stat = let id1 = generateId () in pushId id1 ;
        x := 0; f () ; checkId id1 ; x := 1 ; f () ; checkId id1; !x in popId () ; return_stat

let opposant () =
   let c = ref 0 in
   test_translated (fun _ -> if !c = 0
                           then c := !c + 1
                           else  try begin test_translated(fun _ -> raise (Error)); () end
                                 with Error -> ());;

opposant ();;