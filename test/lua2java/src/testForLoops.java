import org.luaj.vm2.*;
import org.luaj.vm2.lib.*;
public class testForLoops extends VarArgFunction {
   public Varargs onInvoke(Varargs $arg) {
      LuaValue s = _;
      LuaValue t = _;
      LuaValue u = _;
      for ( double m$0=ONE.checkdouble(), m$limit=_5.checkdouble(); m$0<=m$limit; ++m$0 ) {
         final LuaValue m = valueOf(m$0);
         s = s.concat(m);
      }
      for ( double m$1$0=_3.checkdouble(), m$1$limit=_7.checkdouble(), m$1$step=_2.checkdouble(); m$1$step>0? (m$1$0<=m$1$limit): (m$1$0>=m$1$limit); m$1$0+=m$1$step ) {
         final LuaValue m$1 = valueOf(m$1$0);
         t = t.concat(m$1);
      }
      for ( double m$2$0=_9.checkdouble(), m$2$limit=_3.checkdouble(), m$2$step=_3.neg().checkdouble(); m$2$step>0? (m$2$0<=m$2$limit): (m$2$0>=m$2$limit); m$2$0+=m$2$step ) {
         final LuaValue m$2 = valueOf(m$2$0);
         u = u.concat(m$2);
      }
      return s.concat(_$1.concat(t.concat(_$1.concat(u.buffer())))).value();
   }
   static final LuaValue _ = valueOf("");
   static final LuaValue _5 = valueOf(5);
   static final LuaValue _3 = valueOf(3);
   static final LuaValue _7 = valueOf(7);
   static final LuaValue _2 = valueOf(2);
   static final LuaValue _9 = valueOf(9);
   static final LuaValue _$1 = valueOf(" ");
}