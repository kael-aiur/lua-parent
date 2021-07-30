import org.luaj.vm2.*;
import org.luaj.vm2.lib.*;
public class testNeedsArgAndHasArg extends VarArgFunction {
   public Varargs onInvoke(Varargs $arg) {
      env.set(r,new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            final LuaValue q = $arg.arg1();
            $arg = $arg.subargs(2);
            final LuaValue arg = LuaValue.tableOf($arg,1);
            LuaValue $b;
            final LuaValue a = arg;
            return (!($b=a).toboolean()?$b:a.get(_2));
         }
      });
      env.set(s,new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            final LuaValue q = $arg.arg1();
            $arg = $arg.subargs(2);
            final LuaValue arg = NIL;
            LuaValue $b;
            final LuaValue a = arg;
            final LuaValue b = $arg.arg1();
            return varargsOf((!($b=a).toboolean()?$b:a.get(_2)),b);
         }
      });
      return varargsOf(env.get(r).call(_111,_222,_333),env.get(s).invoke(varargsOf(_111,_222,_333)));
   }
   static final LuaValue _2 = valueOf(2);
   static final LuaValue r = valueOf("r");
   static final LuaValue s = valueOf("s");
   static final LuaValue _111 = valueOf(111);
   static final LuaValue _222 = valueOf(222);
   static final LuaValue _333 = valueOf(333);
}