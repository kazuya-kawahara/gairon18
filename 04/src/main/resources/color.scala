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
