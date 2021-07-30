import org.luaj.vm2.*;
import org.luaj.vm2.lib.*;
public class testLoopVarNames extends VarArgFunction {
   public Varargs onInvoke(Varargs $arg) {
      final LuaValue[] w = {_};
      env.set(t,new ZeroArgFunction(env) {
         public LuaValue call() {
            LuaValue f,s,var;
            Varargs v;
            final Varargs v$1 = env.get(ipairs).invoke(LuaValue.listOf(new LuaValue[]{aa,bb,}));
            f = v$1.arg1();
            s = v$1.arg(2);
            var = v$1.arg(3);
            while (true) {
               v = f.invoke(varargsOf(s,var));
               if ((var=v.arg1()).isnil()) break;
               final LuaValue f$1 = var;
               final LuaValue var$1 = v.arg(2);
               w[0] = w[0].concat(_$1.concat(_234.concat(_$2.concat(f$1.concat(_$2.concat(var$1.buffer())))))).value();
            }
            return NONE;
         }
      });
      env.get(t).call();
      return w[0];
   }
   static final LuaValue _ = valueOf("");
   static final LuaValue ipairs = valueOf("ipairs");
   static final LuaValue aa = valueOf("aa");
   static final LuaValue bb = valueOf("bb");
   static final LuaValue _$1 = valueOf(" ");
   static final LuaValue _234 = valueOf(234);
   static final LuaValue _$2 = valueOf(",");
   static final LuaValue t = valueOf("t");
}