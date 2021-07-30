import org.luaj.vm2.*;
import org.luaj.vm2.lib.*;
public class testVarargsInFirstArg extends VarArgFunction {
   public Varargs onInvoke(Varargs $arg) {
      env.set(aaa,new OneArgFunction(env) {
         public LuaValue call(LuaValue x) {
            return x;
         }
      });
      env.set(bbb,new OneArgFunction(env) {
         public LuaValue call(LuaValue y) {
            return y;
         }
      });
      env.set(ccc,new OneArgFunction(env) {
         public LuaValue call(LuaValue z) {
            return z;
         }
      });
      return new TailcallVarargs(env.get(ccc),varargsOf(env.get(aaa).invoke(env.get(bbb).invoke(_123)).arg1(),env.get(aaa).invoke(_456)));
   }
   static final LuaValue aaa = valueOf("aaa");
   static final LuaValue bbb = valueOf("bbb");
   static final LuaValue ccc = valueOf("ccc");
   static final LuaValue _123 = valueOf(123);
   static final LuaValue _456 = valueOf(456);
}