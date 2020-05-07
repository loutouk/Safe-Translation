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

(* below is the prime program found in the code foler that has been translated *)

let is_prime n f =
    (* ceci est un très mauvais test de primalité *)
    let return_stat1 = let id1 = generateId () in pushId id1 ; f () ; checkId id1 ;
    f () ; checkId id1 ;
    f () ; checkId id1 ;
    let rec aux1 a =
      let return_stat2 = let id2 = generateId () in pushId id2 ; f () ; checkId id2 ;
      let rec aux2 b =
        if b = n then false
        else if (a * b) = n then
          true
        else
          aux2 (b+1)
      in
      let return_stat3 = let id3 = generateId () in pushId id3 ; f () ; checkId id3 ;
      if a = n then true else
      if aux2 a then
        false
      else
        aux1 (a+1) in popId () ; return_stat3  in popId () ; return_stat2
    in
    aux1 2 in popId () ; return_stat1
  in
  let rec next_prime n f =
    let return_stat4 = let id4 = generateId () in pushId id4 ; f () ; checkId id4 ;
    if is_prime n f then n else next_prime (n+1) f in popId () ; return_stat4
  in
  next_prime 20 extFunc