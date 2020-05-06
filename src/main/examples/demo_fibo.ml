exception Error ;;
let stack = ref [] ;;
let id = ref 0 ;;
let generateId () = let x = !id in id := !id + 1 ; x ;;
let pushId localId = stack := localId::!stack ;;
let popId () =
   begin match !stack with
   | [] -> failwith "Error, empty stack!"
   | hd::tl -> stack := tl
   end;;
let checkId localId =
   begin match !stack with
   | [] -> failwith "Error, stack id mismatch!"
   | hd::_ -> if hd != localId then failwith "Error, stack id mismatch!"
   end;;

open Format
let extFunc () = printf "External function call" ;;

(* below is the fibo program found in the code foler that has been translated *)
let a = ref 1 in
   let b = ref 1 in
   let rec fibo n f =
     if n = 0 then ()
     else
       (* f() ; *)
       let t = !b in
       let return_stat = let id1 = generateId () in pushId id1 ; f() ; checkId id1 ;
       b := !a + !b;
       a := t;
       fibo (n - 1) f
    in popId () ; return_stat in fibo 8 extFunc; !a