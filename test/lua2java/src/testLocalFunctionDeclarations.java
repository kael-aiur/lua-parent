import org.luaj.vm2.*;
import org.luaj.vm2.lib.*;
public class testLocalFunctionDeclarations extends VarArgFunction {
   public Varargs onInvoke(Varargs $arg) {
      final LuaValue[] aaa = new LuaValue[1];
      aaa[0] = new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            return new TailcallVarargs(env.get(type$1),aaa[0]);
         }
      };
      final LuaValue bbb$1 = new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            return new TailcallVarargs(env.get(type$1),env.get(bbb));
         }
      };
      return varargsOf(aaa[0].call(),bbb$1.invoke());
   }
   static final LuaValue type$1 = valueOf("type");
   static final LuaValue bbb = valueOf("bbb");
}