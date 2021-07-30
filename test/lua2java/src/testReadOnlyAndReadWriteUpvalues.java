import org.luaj.vm2.*;
import org.luaj.vm2.lib.*;
public class testReadOnlyAndReadWriteUpvalues extends VarArgFunction {
   public Varargs onInvoke(Varargs $arg) {
      final LuaValue[] a = {_111};
      final LuaValue c = new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            a[0] = valueOf(a[0].checkdouble()+222);
            return varargsOf(a[0],_222);
         }
      };
      return new TailcallVarargs(c,NONE);
   }
   static final LuaValue _111 = valueOf(111);
   static final LuaValue _222 = valueOf(222);
}