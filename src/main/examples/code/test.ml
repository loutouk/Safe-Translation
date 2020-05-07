let is_prime n f =
    (* ceci est un très mauvais test de primalité *)
    f () ;
    f () ;
    f () ;
    let rec aux1 a =
      f () ;
      let rec aux2 b =
        if b = n then false
        else if (a * b) = n then
          true
        else
          aux2 (b+1)
      in
      f () ;
      if a = n then true else
      if aux2 a then
        false
      else
        aux1 (a+1)
    in
    aux1 2
  in
  let rec next_prime n f =
    f () ;
    if is_prime n f then n else next_prime (n+1) f
  in
  next_prime 20 extFunc