/* Generated By:JJTree: Do not edit this line. ASTLENode.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.sourceforge.pmd.lang.vm.ast;

public
class ASTLENode extends net.sourceforge.pmd.lang.vm.ast.AbstractVmNode {
  public ASTLENode(int id) {
    super(id);
  }

  public ASTLENode(VmParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(VmParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=59c252175f06d4b1b69e91d014d9344c (do not edit this line) */