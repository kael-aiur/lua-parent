import org.luaj.vm2.*;
import org.luaj.vm2.lib.*;
public class testGenericForMultipleValues extends VarArgFunction {
   public Varargs onInvoke(Varargs $arg) {
      final LuaValue iter = new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            return varargsOf(new LuaValue[] {ONE,_2,_3,},_4);
         }
      };
      final LuaValue foo = new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            return varargsOf(iter,_5);
         }
      };
      LuaValue f,s,var;
      Varargs v;
      final Varargs v$1 = foo.invoke();
      f = v$1.arg1();
      s = v$1.arg(2);
      var = v$1.arg(3);
      while (true) {
         v = f.invoke(varargsOf(s,var));
         if ((var=v.arg1()).isnil()) break;
         final LuaValue a = var;
         final LuaValue b = v.arg(2);
         final LuaValue c = v.arg(3);
         return varargsOf(c,b,a);
      }
      return NONE;
   }
   static final LuaValue _2 = valueOf(2);
   static final LuaValue _3 = valueOf(3);
   static final LuaValue _4 = valueOf(4);
   static final LuaValue _5 = valueOf(5);
}