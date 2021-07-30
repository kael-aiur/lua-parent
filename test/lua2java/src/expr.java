import org.luaj.vm2.*;
import org.luaj.vm2.lib.*;
public class expr extends VarArgFunction {
   public Varargs onInvoke(Varargs $arg) {
      return new TailcallVarargs(env.get(math).get(min),varargsOf(_444,_111.neg(),_222.neg()));
   }
   static final LuaValue math = valueOf("math");
   static final LuaValue min = valueOf("min");
   static final LuaValue _444 = valueOf(444);
   static final LuaValue _111 = valueOf(111);
   static final LuaValue _222 = valueOf(222);
}