import org.luaj.vm2.*;
import org.luaj.vm2.lib.*;
public class testNilsInTableConstructor extends VarArgFunction {
   public Varargs onInvoke(Varargs $arg) {
      final LuaValue t = LuaValue.listOf(new LuaValue[]{_111,_222,_333,NIL,NIL,});
      LuaValue s = _;
      LuaValue f,s$1,var;
      Varargs v;
      final Varargs v$1 = env.get(ipairs).invoke(t);
      f = v$1.arg1();
      s$1 = v$1.arg(2);
      var = v$1.arg(3);
      while (true) {
         v = f.invoke(varargsOf(s$1,var));
         if ((var=v.arg1()).isnil()) break;
         final LuaValue i = var;
         final LuaValue v$2 = v.arg(2);
         s = s.concat(env.get(tostring$1).call(i).concat(_$1.concat(env.get(tostring$1).call(v$2).concat(_$2.buffer())))).value();
      }
      return s;
   }
   static final LuaValue _111 = valueOf(111);
   static final LuaValue _222 = valueOf(222);
   static final LuaValue _333 = valueOf(333);
   static final LuaValue _ = valueOf("");
   static final LuaValue ipairs = valueOf("ipairs");
   static final LuaValue tostring$1 = valueOf("tostring");
   static final LuaValue _$1 = valueOf("=");
   static final LuaValue _$2 = valueOf(" ");
}