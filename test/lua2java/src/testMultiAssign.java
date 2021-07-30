import org.luaj.vm2.*;
import org.luaj.vm2.lib.*;
public class testMultiAssign extends VarArgFunction {
   public Varargs onInvoke(Varargs $arg) {
      env.set(a,ONE);
      env.set(b,_10);
      env.set(c,_100);
      final LuaValue t = valueOf((env.get(a).checkdouble()+env.get(b).checkdouble())+env.get(c).checkdouble());
      final LuaValue t$1 = valueOf((env.get(a).checkdouble()+env.get(b).checkdouble())+env.get(c).checkdouble());
      final LuaValue t$2 = valueOf((env.get(a).checkdouble()+env.get(b).checkdouble())+env.get(c).checkdouble());
      env.set(a,t);
      env.set(b,t$1);
      env.set(c,t$2);
      return varargsOf(env.get(a),env.get(b),env.get(c));
   }
   static final LuaValue a = valueOf("a");
   static final LuaValue _10 = valueOf(10);
   static final LuaValue b = valueOf("b");
   static final LuaValue _100 = valueOf(100);
   static final LuaValue c = valueOf("c");
}