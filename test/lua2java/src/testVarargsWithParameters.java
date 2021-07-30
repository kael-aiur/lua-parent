import org.luaj.vm2.*;
import org.luaj.vm2.lib.*;
public class testVarargsWithParameters extends VarArgFunction {
   public Varargs onInvoke(Varargs $arg) {
      final LuaValue func = new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            final LuaValue t = $arg.arg1();
            $arg = $arg.subargs(2);
            final LuaValue arg = NIL;
            return $arg.arg1();
         }
      };
      return new TailcallVarargs(func,varargsOf(_111,_222,_333));
   }
   static final LuaValue _111 = valueOf(111);
   static final LuaValue _222 = valueOf(222);
   static final LuaValue _333 = valueOf(333);
}