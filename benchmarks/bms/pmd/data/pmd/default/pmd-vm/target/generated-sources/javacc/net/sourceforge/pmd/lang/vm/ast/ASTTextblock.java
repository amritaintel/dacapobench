/* Generated By:JJTree: Do not edit this line. ASTTextblock.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.sourceforge.pmd.lang.vm.ast;

public
class ASTTextblock extends net.sourceforge.pmd.lang.vm.ast.AbstractVmNode {
  public ASTTextblock(int id) {
    super(id);
  }

  public ASTTextblock(VmParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(VmParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=6436e11887e1f5e7307089b1d09a364b (do not edit this line) */