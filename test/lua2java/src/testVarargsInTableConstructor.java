import org.luaj.vm2.*;
import org.luaj.vm2.lib.*;
public class testVarargsInTableConstructor extends VarArgFunction {
   public Varargs onInvoke(Varargs $arg) {
      final LuaValue foo = new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            return varargsOf(_111,_222,_333);
         }
      };
      final LuaValue t = LuaValue.tableOf(new LuaValue[]{c,c,},new LuaValue[]{a,b,}, foo.invoke());
      return t.get(_4);
   }
   static final LuaValue _111 = valueOf(111);
   static final LuaValue _222 = valueOf(222);
   static final LuaValue _333 = valueOf(333);
   static final LuaValue c = valueOf("c");
   static final LuaValue a = valueOf("a");
   static final LuaValue b = valueOf("b");
   static final LuaValue _4 = valueOf(4);
}