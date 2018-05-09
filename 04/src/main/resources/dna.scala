:paste

def DNAprefix :
(List[Symbol],List[Symbol]) => Boolean
=
(l1,l2) => {
 l1 match {
 case Nil => true
 case r1::rest1 => 
  l2 match {
  case Nil => false
  case r2::rest2 => 
   if (r1==r2) {DNAprefix(rest1,rest2)}
   else {false}}}}