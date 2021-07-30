import org.luaj.vm2.*;
import org.luaj.vm2.lib.*;
public class _mathlib extends VarArgFunction {
   public Varargs onInvoke(Varargs $arg) {
      final LuaValue platform = $arg.arg1();
      env.get(print).call(platform$1,platform);
      final LuaValue aliases = LuaValue.tableOf(new LuaValue[]{_0,_zero_,_0$1,_zero_,nan,_nan_,inf,_pos_inf,_inf,_neg_inf,_1__INF,_pos_inf,_1__INF$1,_neg_inf,_1__IND,_nan_,_1__IND$1,_nan_,});
      final LuaValue UNOPVALUES = LuaValue.listOf(new LuaValue[]{_2_5.neg(),_2.neg(),ZERO,_2,_2_5,__2_5_,__2_,_0_,_2_,_2_5_,});
      final LuaValue NUMBERPAIRS = LuaValue.listOf(new LuaValue[]{LuaValue.listOf(new LuaValue[]{_2,ZERO,}),LuaValue.listOf(new LuaValue[]{_2_5.neg(),ZERO,}),LuaValue.listOf(new LuaValue[]{_2,ONE,}),LuaValue.listOf(new LuaValue[]{_5,_2,}),LuaValue.listOf(new LuaValue[]{_5.neg(),_2,}),LuaValue.listOf(new LuaValue[]{_16,_2,}),LuaValue.listOf(new LuaValue[]{_16.neg(),_2.neg(),}),LuaValue.listOf(new LuaValue[]{_256,_0_25,}),LuaValue.listOf(new LuaValue[]{_256,_0_25.neg(),}),LuaValue.listOf(new LuaValue[]{_256,_0_25.neg(),}),LuaValue.listOf(new LuaValue[]{_256.neg(),_0_25,}),LuaValue.listOf(new LuaValue[]{_0_5,ZERO,}),LuaValue.listOf(new LuaValue[]{_0_5,ONE,}),LuaValue.listOf(new LuaValue[]{_0_5,_2,}),LuaValue.listOf(new LuaValue[]{_0_5,ONE.neg(),}),LuaValue.listOf(new LuaValue[]{_0_5,_2,}),LuaValue.listOf(new LuaValue[]{_2_25,ZERO,}),LuaValue.listOf(new LuaValue[]{_2_25,_2,}),LuaValue.listOf(new LuaValue[]{_2_25,_0_25,}),LuaValue.listOf(new LuaValue[]{_2_25,_2_25,}),LuaValue.listOf(new LuaValue[]{_2.neg(),ZERO,}),LuaValue.listOf(new LuaValue[]{_3,_3,}),});
      final LuaValue STRINGPAIRS = LuaValue.listOf(new LuaValue[]{LuaValue.listOf(new LuaValue[]{_2_,_0_,}),LuaValue.listOf(new LuaValue[]{_2_5_,_3_,}),LuaValue.listOf(new LuaValue[]{__2_,_1_25_,}),LuaValue.listOf(new LuaValue[]{__2_5_,__1_25_,}),LuaValue.listOf(new LuaValue[]{_3_0_,_3_0_,}),LuaValue.listOf(new LuaValue[]{_2_75,_2_25,}),LuaValue.listOf(new LuaValue[]{_2_75_,_2_25_,}),});
      final LuaValue MIXEDPAIRS = LuaValue.listOf(new LuaValue[]{LuaValue.listOf(new LuaValue[]{_3,_3_,}),LuaValue.listOf(new LuaValue[]{_3_,_3,}),LuaValue.listOf(new LuaValue[]{_2_75,_2_25_,}),LuaValue.listOf(new LuaValue[]{_2_75_,_2_25,}),LuaValue.listOf(new LuaValue[]{_3.neg(),__4_,}),LuaValue.listOf(new LuaValue[]{__3_,_4,}),LuaValue.listOf(new LuaValue[]{_3.neg(),_4_,}),LuaValue.listOf(new LuaValue[]{__3_,_4.neg(),}),LuaValue.listOf(new LuaValue[]{_4_75.neg(),_2_25_,}),LuaValue.listOf(new LuaValue[]{__2_75_,_1_25,}),LuaValue.listOf(new LuaValue[]{_4_75,__2_25_,}),LuaValue.listOf(new LuaValue[]{_2_75_,_1_25.neg(),}),});
      final LuaValue BINOPVALUES = LuaValue.tableOf();
      final LuaValue RELATIONALOPVALUES = LuaValue.tableOf();
      final LuaValue addall = new TwoArgFunction(env) {
         public LuaValue call(LuaValue t,LuaValue s) {
            LuaValue f,s$1,var;
            Varargs v;
            final Varargs v$1 = env.get(ipairs).invoke(s);
            f = v$1.arg1();
            s$1 = v$1.arg(2);
            var = v$1.arg(3);
            while (true) {
               v = f.invoke(varargsOf(s$1,var));
               if ((var=v.arg1()).isnil()) break;
               final LuaValue i = var;
               final LuaValue v$2 = v.arg(2);
               t.set(valueOf(t.length()+1),v$2);
            }
            return NONE;
         }
      };
      addall.call(BINOPVALUES,NUMBERPAIRS);
      addall.call(BINOPVALUES,STRINGPAIRS);
      addall.call(BINOPVALUES,MIXEDPAIRS);
      addall.call(RELATIONALOPVALUES,NUMBERPAIRS);
      addall.call(RELATIONALOPVALUES,STRINGPAIRS);
      final LuaValue VARARGSVALUES = LuaValue.listOf(new LuaValue[]{LuaValue.listOf(new LuaValue[]{_4,}),LuaValue.listOf(new LuaValue[]{_4_5.neg(),}),LuaValue.listOf(new LuaValue[]{_5_5_,}),LuaValue.listOf(new LuaValue[]{__5_,}),LuaValue.listOf(new LuaValue[]{_4,_8_,}),LuaValue.listOf(new LuaValue[]{_4_5.neg(),__8_,}),LuaValue.listOf(new LuaValue[]{_5_5_,_2_2,}),LuaValue.listOf(new LuaValue[]{__5_,_2_2.neg(),}),LuaValue.listOf(new LuaValue[]{_111,_222,_333,}),LuaValue.listOf(new LuaValue[]{_222.neg(),_333.neg(),_111.neg(),}),LuaValue.listOf(new LuaValue[]{_444,_111.neg(),_222.neg(),}),});
      final LuaValue CONSTANTS = LuaValue.listOf(new LuaValue[]{huge,pi,});
      final LuaValue UNARYOPS = LuaValue.listOf(new LuaValue[]{_,not_,});
      final LuaValue BINARYOPS = LuaValue.listOf(new LuaValue[]{_$1,_,_$2,_$3,_$4,_$5,});
      final LuaValue RELATIONALS = LuaValue.listOf(new LuaValue[]{__,__$1,_$6,_$7,__$2,__$3,});
      final LuaValue ONEARG_JME = LuaValue.listOf(new LuaValue[]{abs,ceil,cos,deg,exp,floor,frexp,modf,rad,sin,sqrt,tan,});
      final LuaValue ONEARG_JSE = LuaValue.listOf(new LuaValue[]{acos,asin,atan,cosh,log,log10,sinh,tanh,});
      final LuaValue TWOARGS_JME = LuaValue.listOf(new LuaValue[]{fmod,ldexp,pow$1,});
      final LuaValue TWOARGS_JSE = LuaValue.listOf(new LuaValue[]{atan2,});
      final LuaValue VARARGSFUNCS = LuaValue.listOf(new LuaValue[]{max,min,});
      final LuaValue ts = env.get(tostring$1);
      env.set(tostring$1,new OneArgFunction(env) {
         public LuaValue call(LuaValue x) {
            LuaValue $b;
            final LuaValue s = ts.call(x);
            if ( env.get(type$1).call(x).neq_b(number) ) {
               return s;
            }
            if ( aliases.get(s).toboolean() ) {
               return aliases.get(s);
            }
            if ( s.len().lt_b(_7) ) {
               return s;
            }
            final Varargs t = env.get(string).get(match).invoke(varargsOf(s,____0_9_));
            final LuaValue a = t.arg1();
            final LuaValue b = t.arg(2);
            return (($b=(!($b=a).toboolean()?$b:env.get(string).get(sub$1).call(a,ONE,_6).concat((($b=b).toboolean()?$b:_$8)))).toboolean()?$b:s);
         }
      });
      final LuaValue eval$1 = new TwoArgFunction(env) {
         public LuaValue call(LuaValue expr,LuaValue script) {
            LuaValue $b;
            script = (($b=script).toboolean()?$b:return_.concat(expr));
            final Varargs t = env.get(loadstri).invoke(varargsOf(script,expr$1));
            final LuaValue s = t.arg1();
            final LuaValue a = t.arg(2);
            final LuaValue b = t.arg(3);
            if ( s.toboolean() ) {
               env.get(print).invoke(varargsOf(expr,env.get(pcall).invoke(s)));
            } else {
               env.get(print).call(expr,loadstri$1,a);
            }
            return NONE;
         }
      };
      env.get(print).call(________);
      eval$1.call(math_sin);
      eval$1.call(math_cos);
      eval$1.call(math_sqr);
      eval$1.call(math_mod);
      eval$1.call(math_fre);
      eval$1.call(_5___2);
      eval$1.call(_5___2$1);
      eval$1.call(_5___2$2);
      env.get(print).call(________$1);
      LuaValue f,s,var;
      Varargs v;
      final Varargs v$1 = env.get(ipairs).invoke(CONSTANTS);
      f = v$1.arg1();
      s = v$1.arg(2);
      var = v$1.arg(3);
      while (true) {
         v = f.invoke(varargsOf(s,var));
         if ((var=v.arg1()).isnil()) break;
         final LuaValue i = var;
         final LuaValue v$2 = v.arg(2);
         eval$1.call(math_.concat(v$2));
      }
      LuaValue f$1,s$1,var$1;
      Varargs v$3;
      final Varargs v$4 = env.get(ipairs).invoke(UNARYOPS);
      f$1 = v$4.arg1();
      s$1 = v$4.arg(2);
      var$1 = v$4.arg(3);
      while (true) {
         v$3 = f$1.invoke(varargsOf(s$1,var$1));
         if ((var$1=v$3.arg1()).isnil()) break;
         final LuaValue i$1 = var$1;
         final LuaValue v$5 = v$3.arg(2);
         env.get(print).call(________$2.concat(v$5.concat(________$3.buffer())).value());
         LuaValue f$2,s$2,var$2;
         Varargs v$6;
         final Varargs v$7 = env.get(ipairs).invoke(UNOPVALUES);
         f$2 = v$7.arg1();
         s$2 = v$7.arg(2);
         var$2 = v$7.arg(3);
         while (true) {
            v$6 = f$2.invoke(varargsOf(s$2,var$2));
            if ((var$2=v$6.arg1()).isnil()) break;
            final LuaValue j = var$2;
            final LuaValue a = v$6.arg(2);
            eval$1.call(v$5.concat(a),return_.concat(v$5.concat(a.buffer())).value());
         }
      }
      LuaValue f$3,s$3,var$3;
      Varargs v$8;
      final Varargs v$9 = env.get(ipairs).invoke(BINARYOPS);
      f$3 = v$9.arg1();
      s$3 = v$9.arg(2);
      var$3 = v$9.arg(3);
      while (true) {
         v$8 = f$3.invoke(varargsOf(s$3,var$3));
         if ((var$3=v$8.arg1()).isnil()) break;
         final LuaValue i$2 = var$3;
         final LuaValue v$10 = v$8.arg(2);
         env.get(print).call(________$4.concat(v$10.concat(________$3.buffer())).value());
         LuaValue f$4,s$4,var$4;
         Varargs v$11;
         final Varargs v$12 = env.get(ipairs).invoke(BINOPVALUES);
         f$4 = v$12.arg1();
         s$4 = v$12.arg(2);
         var$4 = v$12.arg(3);
         while (true) {
            v$11 = f$4.invoke(varargsOf(s$4,var$4));
            if ((var$4=v$11.arg1()).isnil()) break;
            final LuaValue j$1 = var$4;
            final LuaValue xy = v$11.arg(2);
            eval$1.call(xy.get(ONE).concat(v$10.concat(xy.get(_2).buffer())).value(),local_x_.concat(xy.get(ONE).concat(_$9.concat(xy.get(_2).concat(__return.concat(v$10.concat(y.buffer())))))).value());
         }
      }
      LuaValue f$5,s$5,var$5;
      Varargs v$13;
      final Varargs v$14 = env.get(ipairs).invoke(RELATIONALS);
      f$5 = v$14.arg1();
      s$5 = v$14.arg(2);
      var$5 = v$14.arg(3);
      while (true) {
         v$13 = f$5.invoke(varargsOf(s$5,var$5));
         if ((var$5=v$13.arg1()).isnil()) break;
         final LuaValue i$3 = var$5;
         final LuaValue v$15 = v$13.arg(2);
         env.get(print).call(________$4.concat(v$15.concat(________$3.buffer())).value());
         LuaValue f$6,s$6,var$6;
         Varargs v$16;
         final Varargs v$17 = env.get(ipairs).invoke(RELATIONALOPVALUES);
         f$6 = v$17.arg1();
         s$6 = v$17.arg(2);
         var$6 = v$17.arg(3);
         while (true) {
            v$16 = f$6.invoke(varargsOf(s$6,var$6));
            if ((var$6=v$16.arg1()).isnil()) break;
            final LuaValue j$2 = var$6;
            final LuaValue xy$1 = v$16.arg(2);
            eval$1.call(xy$1.get(ONE).concat(v$15.concat(xy$1.get(_2).buffer())).value(),local_x_.concat(xy$1.get(ONE).concat(_$9.concat(xy$1.get(_2).concat(__return.concat(v$15.concat(y.buffer())))))).value());
         }
      }
      LuaValue f$7,s$7,var$7;
      Varargs v$18;
      final Varargs v$19 = env.get(ipairs).invoke(ONEARG_JME);
      f$7 = v$19.arg1();
      s$7 = v$19.arg(2);
      var$7 = v$19.arg(3);
      while (true) {
         v$18 = f$7.invoke(varargsOf(s$7,var$7));
         if ((var$7=v$18.arg1()).isnil()) break;
         final LuaValue i$4 = var$7;
         final LuaValue v$20 = v$18.arg(2);
         env.get(print).call(________$5.concat(v$20.concat(________$3.buffer())).value());
         LuaValue f$8,s$8,var$8;
         Varargs v$21;
         final Varargs v$22 = env.get(ipairs).invoke(UNOPVALUES);
         f$8 = v$22.arg1();
         s$8 = v$22.arg(2);
         var$8 = v$22.arg(3);
         while (true) {
            v$21 = f$8.invoke(varargsOf(s$8,var$8));
            if ((var$8=v$21.arg1()).isnil()) break;
            final LuaValue j$3 = var$8;
            final LuaValue x = v$21.arg(2);
            eval$1.call(math_.concat(v$20.concat(_$10.concat(x.concat(_$11.buffer())))).value());
         }
      }
      if ( platform.neq_b(JME) ) {
         LuaValue f$9,s$9,var$9;
         Varargs v$23;
         final Varargs v$24 = env.get(ipairs).invoke(ONEARG_JSE);
         f$9 = v$24.arg1();
         s$9 = v$24.arg(2);
         var$9 = v$24.arg(3);
         while (true) {
            v$23 = f$9.invoke(varargsOf(s$9,var$9));
            if ((var$9=v$23.arg1()).isnil()) break;
            final LuaValue i$5 = var$9;
            final LuaValue v$25 = v$23.arg(2);
            env.get(print).call(________$5.concat(v$25.concat(__jse_on.buffer())).value());
            LuaValue f$10,s$10,var$10;
            Varargs v$26;
            final Varargs v$27 = env.get(ipairs).invoke(UNOPVALUES);
            f$10 = v$27.arg1();
            s$10 = v$27.arg(2);
            var$10 = v$27.arg(3);
            while (true) {
               v$26 = f$10.invoke(varargsOf(s$10,var$10));
               if ((var$10=v$26.arg1()).isnil()) break;
               final LuaValue j$4 = var$10;
               final LuaValue x$1 = v$26.arg(2);
               eval$1.call(math_.concat(v$25.concat(_$10.concat(x$1.concat(_$11.buffer())))).value());
            }
         }
      }
      LuaValue f$11,s$11,var$11;
      Varargs v$28;
      final Varargs v$29 = env.get(ipairs).invoke(TWOARGS_JME);
      f$11 = v$29.arg1();
      s$11 = v$29.arg(2);
      var$11 = v$29.arg(3);
      while (true) {
         v$28 = f$11.invoke(varargsOf(s$11,var$11));
         if ((var$11=v$28.arg1()).isnil()) break;
         final LuaValue i$6 = var$11;
         final LuaValue v$30 = v$28.arg(2);
         env.get(print).call(________$5.concat(v$30.concat(________$3.buffer())).value());
         LuaValue f$12,s$12,var$12;
         Varargs v$31;
         final Varargs v$32 = env.get(ipairs).invoke(BINOPVALUES);
         f$12 = v$32.arg1();
         s$12 = v$32.arg(2);
         var$12 = v$32.arg(3);
         while (true) {
            v$31 = f$12.invoke(varargsOf(s$12,var$12));
            if ((var$12=v$31.arg1()).isnil()) break;
            final LuaValue j$5 = var$12;
            final LuaValue x$2 = v$31.arg(2);
            eval$1.call(math_.concat(v$30.concat(_$10.concat(x$2.get(ONE).concat(_$9.concat(x$2.get(_2).concat(_$11.buffer())))))).value());
         }
      }
      if ( platform.neq_b(JME) ) {
         LuaValue f$13,s$13,var$13;
         Varargs v$33;
         final Varargs v$34 = env.get(ipairs).invoke(TWOARGS_JSE);
         f$13 = v$34.arg1();
         s$13 = v$34.arg(2);
         var$13 = v$34.arg(3);
         while (true) {
            v$33 = f$13.invoke(varargsOf(s$13,var$13));
            if ((var$13=v$33.arg1()).isnil()) break;
            final LuaValue i$7 = var$13;
            final LuaValue v$35 = v$33.arg(2);
            env.get(print).call(________$5.concat(v$35.concat(__jse_on.buffer())).value());
            LuaValue f$14,s$14,var$14;
            Varargs v$36;
            final Varargs v$37 = env.get(ipairs).invoke(BINOPVALUES);
            f$14 = v$37.arg1();
            s$14 = v$37.arg(2);
            var$14 = v$37.arg(3);
            while (true) {
               v$36 = f$14.invoke(varargsOf(s$14,var$14));
               if ((var$14=v$36.arg1()).isnil()) break;
               final LuaValue j$6 = var$14;
               final LuaValue x$3 = v$36.arg(2);
               eval$1.call(math_.concat(v$35.concat(_$10.concat(x$3.get(ONE).concat(_$9.concat(x$3.get(_2).concat(_$11.buffer())))))).value());
            }
         }
      }
      LuaValue f$15,s$15,var$15;
      Varargs v$38;
      final Varargs v$39 = env.get(ipairs).invoke(VARARGSFUNCS);
      f$15 = v$39.arg1();
      s$15 = v$39.arg(2);
      var$15 = v$39.arg(3);
      while (true) {
         v$38 = f$15.invoke(varargsOf(s$15,var$15));
         if ((var$15=v$38.arg1()).isnil()) break;
         final LuaValue i$8 = var$15;
         final LuaValue v$40 = v$38.arg(2);
         env.get(print).call(________$5.concat(v$40.concat(________$3.buffer())).value());
         LuaValue f$16,s$16,var$16;
         Varargs v$41;
         final Varargs v$42 = env.get(ipairs).invoke(VARARGSVALUES);
         f$16 = v$42.arg1();
         s$16 = v$42.arg(2);
         var$16 = v$42.arg(3);
         while (true) {
            v$41 = f$16.invoke(varargsOf(s$16,var$16));
            if ((var$16=v$41.arg1()).isnil()) break;
            final LuaValue j$7 = var$16;
            final LuaValue x$4 = v$41.arg(2);
            eval$1.call(math_.concat(v$40.concat(_$10.concat(env.get(table).get(concat$1).call(x$4,_$9).concat(_$11.buffer())))).value());
         }
      }
      env.get(print).call(________$6);
      final LuaValue testrandom = new ThreeArgFunction(env) {
         public LuaValue call(LuaValue string$1,LuaValue lo,LuaValue hi) {
            LuaValue $b;
            final Varargs t = env.get(loadstri).invoke(return_.concat(string$1));
            final LuaValue c = t.arg1();
            final LuaValue e = t.arg(2);
            for ( double i$9$0=ONE.checkdouble(), i$9$limit=_5.checkdouble(); i$9$0<=i$9$limit; ++i$9$0 ) {
               final LuaValue i$9 = valueOf(i$9$0);
               final Varargs t$1 = env.get(pcall).invoke(c);
               final LuaValue s$17 = t$1.arg1();
               final LuaValue e$1 = t$1.arg(2);
               if ( s$17.toboolean() ) {
                  env.get(print).call(string$1,(($b=(!($b=s$17).toboolean()?$b:env.get(type$1).call(e$1))).toboolean()?$b:e$1),(!($b=e$1.gteq(lo)).toboolean()?$b:e$1.lteq(hi)));
               } else {
                  env.get(print).call(string$1,error$1,e$1);
               }
            }
            return NONE;
         }
      };
      testrandom.call(math_ran,ZERO,ONE);
      testrandom.call(math_ran$1,_5,_10);
      testrandom.call(math_ran$2,ZERO,_30);
      testrandom.call(math_ran$3,_4.neg(),_2.neg());
      final LuaValue t = LuaValue.tableOf();
      env.get(print).invoke(env.get(math).get(randomse).invoke(_20));
      for ( double i$9$0=ONE.checkdouble(), i$9$limit=_20.checkdouble(); i$9$0<=i$9$limit; ++i$9$0 ) {
         final LuaValue i$9 = valueOf(i$9$0);
         t.set(i$9,env.get(math).get(random).call());
      }
      env.get(print).call(___compa);
      for ( double i$10$0=ONE.checkdouble(), i$10$limit=_20.checkdouble(); i$10$0<=i$10$limit; ++i$10$0 ) {
         final LuaValue i$10 = valueOf(i$10$0);
         env.get(print).call(t.get(i$10).eq(env.get(math).get(random).call()),t.get(i$10).eq(t.get(ZERO)));
      }
      env.get(print).call(___reset);
      env.get(print).invoke(env.get(math).get(randomse).invoke(_20));
      for ( double i$11$0=ONE.checkdouble(), i$11$limit=_20.checkdouble(); i$11$0<=i$11$limit; ++i$11$0 ) {
         final LuaValue i$11 = valueOf(i$11$0);
         env.get(print).call(t.get(i$11).eq(env.get(math).get(random).call()));
      }
      return NONE;
   }
   static final LuaValue print = valueOf("print");
   static final LuaValue platform$1 = valueOf("platform");
   static final LuaValue _0 = valueOf("0");
   static final LuaValue _zero_ = valueOf("<zero>");
   static final LuaValue _0$1 = valueOf("-0");
   static final LuaValue nan = valueOf("nan");
   static final LuaValue _nan_ = valueOf("<nan>");
   static final LuaValue inf = valueOf("inf");
   static final LuaValue _pos_inf = valueOf("<pos-inf>");
   static final LuaValue _inf = valueOf("-inf");
   static final LuaValue _neg_inf = valueOf("<neg-inf>");
   static final LuaValue _1__INF = valueOf("1.#INF");
   static final LuaValue _1__INF$1 = valueOf("-1.#INF");
   static final LuaValue _1__IND = valueOf("1.#IND");
   static final LuaValue _1__IND$1 = valueOf("-1.#IND");
   static final LuaValue _2_5 = valueOf(2.5);
   static final LuaValue _2 = valueOf(2);
   static final LuaValue __2_5_ = valueOf("'-2.5'");
   static final LuaValue __2_ = valueOf("'-2'");
   static final LuaValue _0_ = valueOf("'0'");
   static final LuaValue _2_ = valueOf("'2'");
   static final LuaValue _2_5_ = valueOf("'2.5'");
   static final LuaValue _5 = valueOf(5);
   static final LuaValue _16 = valueOf(16);
   static final LuaValue _256 = valueOf(256);
   static final LuaValue _0_25 = valueOf(0.25);
   static final LuaValue _0_5 = valueOf(0.5);
   static final LuaValue _2_25 = valueOf(2.25);
   static final LuaValue _3 = valueOf(3);
   static final LuaValue _3_ = valueOf("'3'");
   static final LuaValue _1_25_ = valueOf("'1.25'");
   static final LuaValue __1_25_ = valueOf("'-1.25'");
   static final LuaValue _3_0_ = valueOf("'3.0'");
   static final LuaValue _2_75 = valueOf(2.75);
   static final LuaValue _2_75_ = valueOf("'2.75'");
   static final LuaValue _2_25_ = valueOf("'2.25'");
   static final LuaValue __4_ = valueOf("'-4'");
   static final LuaValue __3_ = valueOf("'-3'");
   static final LuaValue _4 = valueOf(4);
   static final LuaValue _4_ = valueOf("'4'");
   static final LuaValue _4_75 = valueOf(4.75);
   static final LuaValue __2_75_ = valueOf("'-2.75'");
   static final LuaValue _1_25 = valueOf(1.25);
   static final LuaValue __2_25_ = valueOf("'-2.25'");
   static final LuaValue ipairs = valueOf("ipairs");
   static final LuaValue _4_5 = valueOf(4.5);
   static final LuaValue _5_5_ = valueOf("'5.5'");
   static final LuaValue __5_ = valueOf("'-5'");
   static final LuaValue _8_ = valueOf("'8'");
   static final LuaValue __8_ = valueOf("'-8'");
   static final LuaValue _2_2 = valueOf(2.2);
   static final LuaValue _111 = valueOf(111);
   static final LuaValue _222 = valueOf(222);
   static final LuaValue _333 = valueOf(333);
   static final LuaValue _444 = valueOf(444);
   static final LuaValue huge = valueOf("huge");
   static final LuaValue pi = valueOf("pi");
   static final LuaValue _ = valueOf("-");
   static final LuaValue not_ = valueOf("not ");
   static final LuaValue _$1 = valueOf("+");
   static final LuaValue _$2 = valueOf("*");
   static final LuaValue _$3 = valueOf("^");
   static final LuaValue _$4 = valueOf("/");
   static final LuaValue _$5 = valueOf("%");
   static final LuaValue __ = valueOf("==");
   static final LuaValue __$1 = valueOf("~=");
   static final LuaValue _$6 = valueOf(">");
   static final LuaValue _$7 = valueOf("<");
   static final LuaValue __$2 = valueOf(">=");
   static final LuaValue __$3 = valueOf("<=");
   static final LuaValue abs = valueOf("abs");
   static final LuaValue ceil = valueOf("ceil");
   static final LuaValue cos = valueOf("cos");
   static final LuaValue deg = valueOf("deg");
   static final LuaValue exp = valueOf("exp");
   static final LuaValue floor = valueOf("floor");
   static final LuaValue frexp = valueOf("frexp");
   static final LuaValue modf = valueOf("modf");
   static final LuaValue rad = valueOf("rad");
   static final LuaValue sin = valueOf("sin");
   static final LuaValue sqrt = valueOf("sqrt");
   static final LuaValue tan = valueOf("tan");
   static final LuaValue acos = valueOf("acos");
   static final LuaValue asin = valueOf("asin");
   static final LuaValue atan = valueOf("atan");
   static final LuaValue cosh = valueOf("cosh");
   static final LuaValue log = valueOf("log");
   static final LuaValue log10 = valueOf("log10");
   static final LuaValue sinh = valueOf("sinh");
   static final LuaValue tanh = valueOf("tanh");
   static final LuaValue fmod = valueOf("fmod");
   static final LuaValue ldexp = valueOf("ldexp");
   static final LuaValue pow$1 = valueOf("pow");
   static final LuaValue atan2 = valueOf("atan2");
   static final LuaValue max = valueOf("max");
   static final LuaValue min = valueOf("min");
   static final LuaValue tostring$1 = valueOf("tostring");
   static final LuaValue type$1 = valueOf("type");
   static final LuaValue number = valueOf("number");
   static final LuaValue _7 = valueOf(7);
   static final LuaValue string = valueOf("string");
   static final LuaValue match = valueOf("match");
   static final LuaValue ____0_9_ = valueOf("([%-0-9%.]*)([eE]?[%-0-9]*)");
   static final LuaValue sub$1 = valueOf("sub");
   static final LuaValue _6 = valueOf(6);
   static final LuaValue _$8 = valueOf("");
   static final LuaValue return_ = valueOf("return ");
   static final LuaValue loadstri = valueOf("loadstring");
   static final LuaValue expr$1 = valueOf("expr");
   static final LuaValue pcall = valueOf("pcall");
   static final LuaValue loadstri$1 = valueOf("loadstring:");
   static final LuaValue ________ = valueOf("---------- miscellaneous tests ----------");
   static final LuaValue math_sin = valueOf("math.sin( 0.0 )");
   static final LuaValue math_cos = valueOf("math.cos( math.pi )");
   static final LuaValue math_sqr = valueOf("math.sqrt( 9.0 )");
   static final LuaValue math_mod = valueOf("math.modf( 5.25 )");
   static final LuaValue math_fre = valueOf("math.frexp(0.00625)");
   static final LuaValue _5___2 = valueOf("-5 ^ 2");
   static final LuaValue _5___2$1 = valueOf("-5 / 2");
   static final LuaValue _5___2$2 = valueOf("-5 % 2");
   static final LuaValue ________$1 = valueOf("---------- constants ----------");
   static final LuaValue math_ = valueOf("math.");
   static final LuaValue ________$2 = valueOf("---------- unary operator ");
   static final LuaValue ________$3 = valueOf(" ----------");
   static final LuaValue ________$4 = valueOf("---------- binary operator ");
   static final LuaValue local_x_ = valueOf("local x,y=");
   static final LuaValue _$9 = valueOf(",");
   static final LuaValue __return = valueOf("; return x");
   static final LuaValue y = valueOf("y");
   static final LuaValue ________$5 = valueOf("---------- math.");
   static final LuaValue _$10 = valueOf("(");
   static final LuaValue _$11 = valueOf(")");
   static final LuaValue JME = valueOf("JME");
   static final LuaValue __jse_on = valueOf(" (jse only) ----------");
   static final LuaValue table = valueOf("table");
   static final LuaValue concat$1 = valueOf("concat");
   static final LuaValue ________$6 = valueOf("----------- Random number tests");
   static final LuaValue error$1 = valueOf("error");
   static final LuaValue math_ran = valueOf("math.random()");
   static final LuaValue math_ran$1 = valueOf("math.random(5,10)");
   static final LuaValue _10 = valueOf(10);
   static final LuaValue math_ran$2 = valueOf("math.random(30)");
   static final LuaValue _30 = valueOf(30);
   static final LuaValue math_ran$3 = valueOf("math.random(-4,-2)");
   static final LuaValue math = valueOf("math");
   static final LuaValue randomse = valueOf("randomseed");
   static final LuaValue _20 = valueOf(20);
   static final LuaValue random = valueOf("random");
   static final LuaValue ___compa = valueOf("-- comparing new numbers");
   static final LuaValue ___reset = valueOf("-- resetting seed");
}