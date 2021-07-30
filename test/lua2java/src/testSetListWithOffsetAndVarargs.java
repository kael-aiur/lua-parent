import org.luaj.vm2.*;
import org.luaj.vm2.lib.*;
public class testSetListWithOffsetAndVarargs extends VarArgFunction {
   public Varargs onInvoke(Varargs $arg) {
      final LuaValue bar = LuaValue.listOf(new LuaValue[]{_1000,}, env.get(math).get(sqrt).invoke(_9));
      return valueOf(bar.get(ONE).checkdouble()+bar.get(_2).checkdouble());
   }
   static final LuaValue _1000 = valueOf(1000);
   static final LuaValue math = valueOf("math");
   static final LuaValue sqrt = valueOf("sqrt");
   static final LuaValue _9 = valueOf(9);
   static final LuaValue _2 = valueOf(2);
}