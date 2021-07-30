import org.luaj.vm2.*;
import org.luaj.vm2.lib.*;
public class testControlCharStringLiterals extends VarArgFunction {
   public Varargs onInvoke(Varargs $arg) {
      final LuaValue t = LuaValue.listOf(new LuaValue[]{}, env.get(string).get(byte$1).invoke(varargsOf(a_b_c_d_,ONE,a_b_c_d_.len())));
      return new TailcallVarargs(env.get(table).get(concat$1),varargsOf(t,_));
   }
   static final LuaValue string = valueOf("string");
   static final LuaValue byte$1 = valueOf("byte");
   static final LuaValue a_b_c_d_ = valueOf("a\u0000b\u0012c\u0012d\u00120e");
   static final LuaValue table = valueOf("table");
   static final LuaValue concat$1 = valueOf("concat");
   static final LuaValue _ = valueOf(",");
}