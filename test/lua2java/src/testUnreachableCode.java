import org.luaj.vm2.*;
import org.luaj.vm2.lib.*;
public class testUnreachableCode extends VarArgFunction {
   public Varargs onInvoke(Varargs $arg) {
      final LuaValue foo = new OneArgFunction(env) {
         public LuaValue call(LuaValue x) {
            return valueOf(x.checkdouble()*2);
         }
      };
      final LuaValue bar = new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            final LuaValue x = $arg.arg1();
            final LuaValue y = $arg.arg(2);
            if ( x.eq_b(y) ) {
               return y;
            } else {
               return new TailcallVarargs(foo,x);
            }
         }
      };
      return new TailcallVarargs(bar,varargsOf(_33,_44));
   }
   static final LuaValue _33 = valueOf(33);
   static final LuaValue _44 = valueOf(44);
}