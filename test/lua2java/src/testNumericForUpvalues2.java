import org.luaj.vm2.*;
import org.luaj.vm2.lib.*;
public class testNumericForUpvalues2 extends VarArgFunction {
   public Varargs onInvoke(Varargs $arg) {
      final LuaValue t = LuaValue.tableOf();
      for ( double i$0=ONE.checkdouble(), i$limit=_2.checkdouble(); i$0<=i$limit; ++i$0 ) {
         final LuaValue i = valueOf(i$0);
         t.set(i,_123_456.method(gsub,_d,new OneArgFunction(env) {
            public LuaValue call(LuaValue s) {
               return i;
            }
         }));
      }
      return t.get(_2);
   }
   static final LuaValue _2 = valueOf(2);
   static final LuaValue _123_456 = valueOf("123 456");
   static final LuaValue gsub = valueOf("gsub");
   static final LuaValue _d = valueOf("%d");
}