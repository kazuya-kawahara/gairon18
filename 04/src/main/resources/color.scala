abstract class ParentTree
case object Empty extends ParentTree
case class MakeParent(
  children:List[ParentTree],
  name:Symbol, 
  date:Int, 
  eyes:Symbol
) extends ParentTree

:paste
//プログラムは以下に書くこと

def color :
(ParentTree) => List[Symbol]
=
(tree) => {
 tree match {
  case Empty => Nil
  case MakeParent(Nil,n,d,e) => e::Nil
  case MakeParent(r::rest,n,d,e) => e::color(r)++color(MakeParent(rest,n,d,e))}}