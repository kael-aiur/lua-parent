import org.luaj.vm2.*;
import org.luaj.vm2.lib.*;
public class _functions extends VarArgFunction {
   public Varargs onInvoke(Varargs $arg) {
      env.set(f0,new ZeroArgFunction(env) {
         public LuaValue call() {
            env.get(print).call(f0_);
            return NONE;
         }
      });
      env.set(f1,new OneArgFunction(env) {
         public LuaValue call(LuaValue a) {
            env.get(print).call(f1_,a);
            return NONE;
         }
      });
      env.set(f2,new TwoArgFunction(env) {
         public LuaValue call(LuaValue a,LuaValue b) {
            env.get(print).call(f2_,a,b);
            return NONE;
         }
      });
      env.set(f3,new ThreeArgFunction(env) {
         public LuaValue call(LuaValue a,LuaValue b,LuaValue c) {
            env.get(print).invoke(varargsOf(new LuaValue[] {f3_,a,b,},c));
            return NONE;
         }
      });
      env.set(f4,new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            final LuaValue a = $arg.arg1();
            final LuaValue b = $arg.arg(2);
            final LuaValue c = $arg.arg(3);
            final LuaValue d = $arg.arg(4);
            env.get(print).invoke(varargsOf(new LuaValue[] {f4_,a,b,c,},d));
            return NONE;
         }
      });
      env.get(f0).call();
      env.get(f0).call(a1_1);
      env.get(f0).call(a1_2,a2_2);
      env.get(f0).call(a1_3,a2_3,a3_3);
      env.get(f0).invoke(varargsOf(new LuaValue[] {a1_4,a2_4,a3_4,},a4_4));
      env.get(f1).call();
      env.get(f1).call(a1_1);
      env.get(f1).call(a1_2,a2_2);
      env.get(f1).call(a1_3,a2_3,a3_3);
      env.get(f1).invoke(varargsOf(new LuaValue[] {a1_4,a2_4,a3_4,},a4_4));
      env.get(f2).call();
      env.get(f2).call(a1_1);
      env.get(f2).call(a1_2,a2_2);
      env.get(f2).call(a1_3,a2_3,a3_3);
      env.get(f2).invoke(varargsOf(new LuaValue[] {a1_4,a2_4,a3_4,},a4_4));
      env.get(f3).call();
      env.get(f3).call(a1_1);
      env.get(f3).call(a1_2,a2_2);
      env.get(f3).call(a1_3,a2_3,a3_3);
      env.get(f3).invoke(varargsOf(new LuaValue[] {a1_4,a2_4,a3_4,},a4_4));
      env.get(f4).call();
      env.get(f4).call(a1_1);
      env.get(f4).call(a1_2,a2_2);
      env.get(f4).call(a1_3,a2_3,a3_3);
      env.get(f4).invoke(varargsOf(new LuaValue[] {a1_4,a2_4,a3_4,},a4_4));
      env.set(g0,new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            final LuaValue a = $arg.arg1();
            final LuaValue b = $arg.arg(2);
            final LuaValue c = $arg.arg(3);
            final LuaValue d = $arg.arg(4);
            return NONE;
         }
      });
      env.set(g1,new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            final LuaValue a = $arg.arg1();
            final LuaValue b = $arg.arg(2);
            final LuaValue c = $arg.arg(3);
            final LuaValue d = $arg.arg(4);
            return d;
         }
      });
      env.set(g2,new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            final LuaValue a = $arg.arg1();
            final LuaValue b = $arg.arg(2);
            final LuaValue c = $arg.arg(3);
            final LuaValue d = $arg.arg(4);
            return varargsOf(c,d);
         }
      });
      env.set(g3,new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            final LuaValue a = $arg.arg1();
            final LuaValue b = $arg.arg(2);
            final LuaValue c = $arg.arg(3);
            final LuaValue d = $arg.arg(4);
            return varargsOf(b,c,d);
         }
      });
      env.set(g4,new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            final LuaValue a = $arg.arg1();
            final LuaValue b = $arg.arg(2);
            final LuaValue c = $arg.arg(3);
            final LuaValue d = $arg.arg(4);
            return varargsOf(new LuaValue[] {a,b,c,},d);
         }
      });
      env.set(z,env.get(g0).invoke(varargsOf(new LuaValue[] {c0_1_4,c0_2_4,c0_3_4,},c0_4_4)).arg1());
      env.get(print).call(z0_,env.get(z));
      env.set(z,env.get(g2).invoke(varargsOf(new LuaValue[] {c2_1_4,c2_2_4,c2_3_4,},c2_4_4)).arg1());
      env.get(print).call(z2_,env.get(z));
      env.set(z,env.get(g4).invoke(varargsOf(new LuaValue[] {c4_1_4,c4_2_4,c4_3_4,},c4_4_4)).arg1());
      env.get(print).call(z4_,env.get(z));
      final Varargs v = env.get(g0).invoke(varargsOf(new LuaValue[] {c0_1_4,c0_2_4,c0_3_4,},c0_4_4));
      env.set(a,v.arg1());
      env.set(b,v.arg(2));
      env.set(c,v.arg(3));
      env.set(d,v.arg(4));
      env.get(print).invoke(varargsOf(new LuaValue[] {g0_,env.get(a),env.get(b),env.get(c),env.get(d),},_eol_));
      final Varargs v$1 = env.get(g2).invoke(varargsOf(new LuaValue[] {b2_1_4,b2_2_4,b2_3_4,},b2_4_4));
      env.set(a,v$1.arg1());
      env.set(b,v$1.arg(2));
      env.set(c,v$1.arg(3));
      env.set(d,v$1.arg(4));
      env.get(print).invoke(varargsOf(new LuaValue[] {g2_,env.get(a),env.get(b),env.get(c),env.get(d),},_eol_));
      final Varargs v$2 = env.get(g4).invoke(varargsOf(new LuaValue[] {b4_1_4,b4_2_4,b4_3_4,},b4_4_4));
      env.set(a,v$2.arg1());
      env.set(b,v$2.arg(2));
      env.set(c,v$2.arg(3));
      env.set(d,v$2.arg(4));
      env.get(print).invoke(varargsOf(new LuaValue[] {g4_,env.get(a),env.get(b),env.get(c),env.get(d),},_eol_));
      env.set(func,new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            final LuaValue a$1 = $arg.arg1();
            final LuaValue b$1 = $arg.arg(2);
            final LuaValue c$1 = $arg.arg(3);
            return varargsOf(a$1,b$1,c$1);
         }
      });
      env.get(print).invoke(env.get(func).invoke(varargsOf(_11,_12,_13)));
      env.get(print).invoke(env.get(func).invoke(varargsOf(_23,_22,_21)));
      env.get(print).invoke(env.get(func).invoke(varargsOf(env.get(func).call(_32,_33,_34),env.get(func).call(_45,_46,_47),env.get(func).invoke(varargsOf(_58,_59,_50)))));
      env.set(p,new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            final LuaValue a$1 = $arg.arg1();
            $arg = $arg.subargs(2);
            final LuaValue arg = NIL;
            env.get(print).call(a,a$1);
            env.get(print).invoke(varargsOf(___,$arg));
            env.get(print).call(____a,$arg.arg1(),a$1);
            env.get(print).invoke(varargsOf(a____,a$1,$arg));
            return NONE;
         }
      });
      env.get(p).call();
      env.get(p).call(q);
      env.get(p).call(q,r);
      env.get(p).call(q,r,s);
      env.set(first,new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            final LuaValue arg = NIL;
            return varargsOf(new LuaValue[] {abc,$arg.arg1(),_,},$arg);
         }
      });
      env.set(second,new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            final LuaValue a$1 = $arg.arg1();
            $arg = $arg.subargs(2);
            final LuaValue arg = NIL;
            return varargsOf(new LuaValue[] {def,$arg.arg1(),_,a$1,},$arg);
         }
      });
      env.set(third,new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            final LuaValue a$1 = $arg.arg1();
            final LuaValue b$1 = $arg.arg(2);
            final LuaValue c$1 = $arg.arg(3);
            env.get(print).invoke(varargsOf(third,env.get(first).invoke(varargsOf(a$1,b$1,c$1))));
            env.get(print).invoke(varargsOf(third,env.get(second).invoke(varargsOf(a$1,b$1,c$1))));
            return new TailcallVarargs(env.get(second),varargsOf(a$1,b$1,c$1));
         }
      });
      env.get(print).invoke(varargsOf(third,env.get(third).invoke()));
      env.get(print).invoke(varargsOf(third,env.get(third).invoke(p)));
      env.get(print).invoke(varargsOf(third,env.get(third).invoke(varargsOf(p,q))));
      env.get(print).invoke(varargsOf(third,env.get(third).invoke(varargsOf(p,q,r))));
      env.get(print).invoke(varargsOf(third,env.get(third).invoke(varargsOf(new LuaValue[] {p,q,r,},s))));
      env.get(print).invoke(varargsOf(third,env.get(third).invoke()));
      return NONE;
   }
   static final LuaValue print = valueOf("print");
   static final LuaValue f0_ = valueOf("f0:");
   static final LuaValue f0 = valueOf("f0");
   static final LuaValue f1_ = valueOf("f1:");
   static final LuaValue f1 = valueOf("f1");
   static final LuaValue f2_ = valueOf("f2:");
   static final LuaValue f2 = valueOf("f2");
   static final LuaValue f3_ = valueOf("f3:");
   static final LuaValue f3 = valueOf("f3");
   static final LuaValue f4_ = valueOf("f4:");
   static final LuaValue f4 = valueOf("f4");
   static final LuaValue a1_1 = valueOf("a1/1");
   static final LuaValue a1_2 = valueOf("a1/2");
   static final LuaValue a2_2 = valueOf("a2/2");
   static final LuaValue a1_3 = valueOf("a1/3");
   static final LuaValue a2_3 = valueOf("a2/3");
   static final LuaValue a3_3 = valueOf("a3/3");
   static final LuaValue a1_4 = valueOf("a1/4");
   static final LuaValue a2_4 = valueOf("a2/4");
   static final LuaValue a3_4 = valueOf("a3/4");
   static final LuaValue a4_4 = valueOf("a4/4");
   static final LuaValue g0 = valueOf("g0");
   static final LuaValue g1 = valueOf("g1");
   static final LuaValue g2 = valueOf("g2");
   static final LuaValue g3 = valueOf("g3");
   static final LuaValue g4 = valueOf("g4");
   static final LuaValue c0_1_4 = valueOf("c0.1/4");
   static final LuaValue c0_2_4 = valueOf("c0.2/4");
   static final LuaValue c0_3_4 = valueOf("c0.3/4");
   static final LuaValue c0_4_4 = valueOf("c0.4/4");
   static final LuaValue z = valueOf("z");
   static final LuaValue z0_ = valueOf("z0:");
   static final LuaValue c2_1_4 = valueOf("c2.1/4");
   static final LuaValue c2_2_4 = valueOf("c2.2/4");
   static final LuaValue c2_3_4 = valueOf("c2.3/4");
   static final LuaValue c2_4_4 = valueOf("c2.4/4");
   static final LuaValue z2_ = valueOf("z2:");
   static final LuaValue c4_1_4 = valueOf("c4.1/4");
   static final LuaValue c4_2_4 = valueOf("c4.2/4");
   static final LuaValue c4_3_4 = valueOf("c4.3/4");
   static final LuaValue c4_4_4 = valueOf("c4.4/4");
   static final LuaValue z4_ = valueOf("z4:");
   static final LuaValue a = valueOf("a");
   static final LuaValue b = valueOf("b");
   static final LuaValue c = valueOf("c");
   static final LuaValue d = valueOf("d");
   static final LuaValue g0_ = valueOf("g0:");
   static final LuaValue _eol_ = valueOf("(eol)");
   static final LuaValue b2_1_4 = valueOf("b2.1/4");
   static final LuaValue b2_2_4 = valueOf("b2.2/4");
   static final LuaValue b2_3_4 = valueOf("b2.3/4");
   static final LuaValue b2_4_4 = valueOf("b2.4/4");
   static final LuaValue g2_ = valueOf("g2:");
   static final LuaValue b4_1_4 = valueOf("b4.1/4");
   static final LuaValue b4_2_4 = valueOf("b4.2/4");
   static final LuaValue b4_3_4 = valueOf("b4.3/4");
   static final LuaValue b4_4_4 = valueOf("b4.4/4");
   static final LuaValue g4_ = valueOf("g4:");
   static final LuaValue func = valueOf("func");
   static final LuaValue _11 = valueOf(11);
   static final LuaValue _12 = valueOf(12);
   static final LuaValue _13 = valueOf(13);
   static final LuaValue _23 = valueOf(23);
   static final LuaValue _22 = valueOf(22);
   static final LuaValue _21 = valueOf(21);
   static final LuaValue _32 = valueOf(32);
   static final LuaValue _33 = valueOf(33);
   static final LuaValue _34 = valueOf(34);
   static final LuaValue _45 = valueOf(45);
   static final LuaValue _46 = valueOf(46);
   static final LuaValue _47 = valueOf(47);
   static final LuaValue _58 = valueOf(58);
   static final LuaValue _59 = valueOf(59);
   static final LuaValue _50 = valueOf(50);
   static final LuaValue ___ = valueOf("...");
   static final LuaValue ____a = valueOf("...,a");
   static final LuaValue a____ = valueOf("a,...");
   static final LuaValue p = valueOf("p");
   static final LuaValue q = valueOf("q");
   static final LuaValue r = valueOf("r");
   static final LuaValue s = valueOf("s");
   static final LuaValue abc = valueOf("abc");
   static final LuaValue _ = valueOf("|");
   static final LuaValue first = valueOf("first");
   static final LuaValue def = valueOf("def");
   static final LuaValue second = valueOf("second");
   static final LuaValue third = valueOf("third");
}