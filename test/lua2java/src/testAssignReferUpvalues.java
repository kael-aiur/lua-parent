import org.luaj.vm2.*;
import org.luaj.vm2.lib.*;
public class testAssignReferUpvalues extends VarArgFunction {
   public Varargs onInvoke(Varargs $arg) {
      LuaValue $b;
      final LuaValue[] entity = {_234};
      final LuaValue c = new ZeroArgFunction(env) {
         public LuaValue call() {
            return entity[0];
         }
      };
      entity[0] = (!($b=env.get(a).eq(env.get(b))).toboolean()?$b:_123);
      if ( entity[0].toboolean() ) {
         return entity[0];
      }
      return NONE;
   }
   static final LuaValue _234 = valueOf(234);
   static final LuaValue a = valueOf("a");
   static final LuaValue b = valueOf("b");
   static final LuaValue _123 = valueOf(123);
}