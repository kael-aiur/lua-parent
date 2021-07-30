import org.luaj.vm2.*;
import org.luaj.vm2.lib.*;
public class _baselib extends VarArgFunction {
   public Varargs onInvoke(Varargs $arg) {
      LuaValue $b;
      final LuaValue ts = env.get(tostring$1);
      final LuaValue id = LuaValue.tableOf();
      final LuaValue[] nid = {ZERO};
      final LuaValue types = LuaValue.tableOf(new LuaValue[]{table,tbl,thread,thr,userdata,uda,function,func,});
      env.set(tostring$1,new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            final LuaValue x = $arg.arg1();
            LuaValue $b;
            if ( ((!x.toboolean())||(!types.get(env.get(type$1).call(x)).toboolean())) ) {
               return new TailcallVarargs(ts,x);
            }
            if ( (!id.get(x).toboolean()) ) {
               nid[0] = valueOf(nid[0].checkdouble()+1);
               id.set(x,types.get(env.get(type$1).call(x)).concat(_.concat(nid[0].buffer())).value());
            }
            return id.get(x);
         }
      });
      final LuaValue pc = env.get(pcall);
      final LuaValue pcall$1 = new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            final LuaValue arg = NIL;
            final Varargs t = pc.invoke($arg);
            final LuaValue s = t.arg1();
            final LuaValue e = t.arg(2);
            if ( s.toboolean() ) {
               return e;
            }
            return varargsOf(FALSE,env.get(type$1).invoke(e));
         }
      };
      env.get(print).call();
      env.get(print).call(_11);
      env.get(print).invoke(varargsOf(new LuaValue[] {abc,_123,NIL,},pqr));
      env.get(print).call((($b=(!($b=NIL).toboolean()?$b:T)).toboolean()?$b:F));
      env.get(print).call((($b=(!($b=FALSE).toboolean()?$b:T)).toboolean()?$b:F));
      env.get(print).call((($b=(!($b=ZERO).toboolean()?$b:T)).toboolean()?$b:F));
      env.get(print).invoke(varargsOf(assert_t,env.get(assert$1).invoke(TRUE)));
      env.get(print).invoke(varargsOf(pcall_as,pcall$1.invoke(varargsOf(env.get(assert$1),TRUE))));
      env.get(print).invoke(varargsOf(pcall_as$1,pcall$1.invoke(varargsOf(env.get(assert$1),FALSE))));
      env.get(print).invoke(varargsOf(pcall_as$2,pcall$1.invoke(varargsOf(env.get(assert$1),NIL))));
      env.get(print).invoke(varargsOf(pcall_as$3,pcall$1.invoke(varargsOf(env.get(assert$1),TRUE,msg))));
      env.get(print).invoke(varargsOf(pcall_as$4,pcall$1.invoke(varargsOf(env.get(assert$1),FALSE,msg))));
      env.get(print).invoke(varargsOf(pcall_as$5,pcall$1.invoke(varargsOf(env.get(assert$1),NIL,msg))));
      env.get(print).invoke(varargsOf(pcall_as$6,pcall$1.invoke(varargsOf(new LuaValue[] {env.get(assert$1),FALSE,msg,},msg2))));
      env.get(print).invoke(varargsOf(collectg,env.get(type$1).invoke(env.get(collectg$1).invoke(count))));
      env.get(print).invoke(varargsOf(collectg$2,env.get(type$1).invoke(env.get(collectg$1).invoke(collect))));
      env.get(print).invoke(varargsOf(collectg,env.get(type$1).invoke(env.get(collectg$1).invoke(count))));
      env.get(print).invoke(varargsOf(pcall_ip,pcall$1.invoke(env.get(ipairs))));
      env.get(print).invoke(varargsOf(pcall_ip$1,pcall$1.invoke(varargsOf(env.get(ipairs),NIL))));
      env.get(print).invoke(varargsOf(pcall_ip$2,pcall$1.invoke(varargsOf(env.get(ipairs),a))));
      env.get(print).invoke(varargsOf(pcall_ip$3,pcall$1.invoke(varargsOf(env.get(ipairs),ONE))));
      LuaValue f,s,var;
      Varargs v;
      final Varargs v$1 = env.get(ipairs).invoke(LuaValue.tableOf());
      f = v$1.arg1();
      s = v$1.arg(2);
      var = v$1.arg(3);
      while (true) {
         v = f.invoke(varargsOf(s,var));
         if ((var=v.arg1()).isnil()) break;
         final LuaValue k = var;
         final LuaValue v$2 = v.arg(2);
         env.get(print).call(ipairs1,k,v$2);
      }
      LuaValue f$1,s$1,var$1;
      Varargs v$3;
      final Varargs v$4 = env.get(ipairs).invoke(LuaValue.listOf(new LuaValue[]{one,two,}));
      f$1 = v$4.arg1();
      s$1 = v$4.arg(2);
      var$1 = v$4.arg(3);
      while (true) {
         v$3 = f$1.invoke(varargsOf(s$1,var$1));
         if ((var$1=v$3.arg1()).isnil()) break;
         final LuaValue k$1 = var$1;
         final LuaValue v$5 = v$3.arg(2);
         env.get(print).call(ipairs2,k$1,v$5);
      }
      LuaValue f$2,s$2,var$2;
      Varargs v$6;
      final Varargs v$7 = env.get(ipairs).invoke(LuaValue.tableOf(new LuaValue[]{aa,aaa,bb,bbb,}));
      f$2 = v$7.arg1();
      s$2 = v$7.arg(2);
      var$2 = v$7.arg(3);
      while (true) {
         v$6 = f$2.invoke(varargsOf(s$2,var$2));
         if ((var$2=v$6.arg1()).isnil()) break;
         final LuaValue k$2 = var$2;
         final LuaValue v$8 = v$6.arg(2);
         env.get(print).call(ipairs3,k$2,v$8);
      }
      LuaValue f$3,s$3,var$3;
      Varargs v$9;
      final Varargs v$10 = env.get(ipairs).invoke(LuaValue.tableOf(new LuaValue[]{aa,aaa,bb,bbb,},new LuaValue[]{one,two,}));
      f$3 = v$10.arg1();
      s$3 = v$10.arg(2);
      var$3 = v$10.arg(3);
      while (true) {
         v$9 = f$3.invoke(varargsOf(s$3,var$3));
         if ((var$3=v$9.arg1()).isnil()) break;
         final LuaValue k$3 = var$3;
         final LuaValue v$11 = v$9.arg(2);
         env.get(print).call(ipairs4,k$3,v$11);
      }
      LuaValue f$4,s$4,var$4;
      Varargs v$12;
      final Varargs v$13 = env.get(ipairs).invoke(LuaValue.tableOf(new LuaValue[]{_30,_30$1,_20,_20$1,}));
      f$4 = v$13.arg1();
      s$4 = v$13.arg(2);
      var$4 = v$13.arg(3);
      while (true) {
         v$12 = f$4.invoke(varargsOf(s$4,var$4));
         if ((var$4=v$12.arg1()).isnil()) break;
         final LuaValue k$4 = var$4;
         final LuaValue v$14 = v$12.arg(2);
         env.get(print).call(ipairs5,k$4,v$14);
      }
      env.set(t,LuaValue.listOf(new LuaValue[]{print_,_table_,loaded_,_$1,_print_a,}));
      env.set(i,ZERO);
      env.set(f$5,new ZeroArgFunction(env) {
         public LuaValue call() {
            env.set(i,valueOf(env.get(i).checkdouble()+1));
            return env.get(t).get(env.get(i));
         }
      });
      final Varargs v$15 = env.get(load$1).invoke(env.get(f$5));
      env.set(c,v$15.arg1());
      env.set(e,v$15.arg(2));
      if ( env.get(c).toboolean() ) {
         env.get(print).invoke(varargsOf(load__,pcall$1.invoke(env.get(c))));
      } else {
         env.get(print).call(load_fai,env.get(e));
      }
      final Varargs t$1 = env.get(loadstri).invoke(print_3_);
      final LuaValue chunk = t$1.arg1();
      final LuaValue err = t$1.arg(2);
      env.get(print).call(loadstri$1.concat(print_3_.concat(__.buffer())).value(),chunk,err);
      env.get(print).invoke(varargsOf(loadstri$1.concat(print_3_.concat(____.buffer())).value(),chunk.invoke()));
      env.get(print).invoke(varargsOf(pcall_pa,pcall$1.invoke(env.get(pairs))));
      env.get(print).invoke(varargsOf(pcall_pa$1,pcall$1.invoke(varargsOf(env.get(pairs),NIL))));
      env.get(print).invoke(varargsOf(pcall_pa$2,pcall$1.invoke(varargsOf(env.get(pairs),a))));
      env.get(print).invoke(varargsOf(pcall_pa$3,pcall$1.invoke(varargsOf(env.get(pairs),ONE))));
      LuaValue f$6,s$5,var$5;
      Varargs v$16;
      final Varargs v$17 = env.get(pairs).invoke(LuaValue.tableOf());
      f$6 = v$17.arg1();
      s$5 = v$17.arg(2);
      var$5 = v$17.arg(3);
      while (true) {
         v$16 = f$6.invoke(varargsOf(s$5,var$5));
         if ((var$5=v$16.arg1()).isnil()) break;
         final LuaValue k$5 = var$5;
         final LuaValue v$18 = v$16.arg(2);
         env.get(print).call(pairs1,k$5,v$18);
      }
      LuaValue f$7,s$6,var$6;
      Varargs v$19;
      final Varargs v$20 = env.get(pairs).invoke(LuaValue.listOf(new LuaValue[]{one,two,}));
      f$7 = v$20.arg1();
      s$6 = v$20.arg(2);
      var$6 = v$20.arg(3);
      while (true) {
         v$19 = f$7.invoke(varargsOf(s$6,var$6));
         if ((var$6=v$19.arg1()).isnil()) break;
         final LuaValue k$6 = var$6;
         final LuaValue v$21 = v$19.arg(2);
         env.get(print).call(pairs2,k$6,v$21);
      }
      LuaValue f$8,s$7,var$7;
      Varargs v$22;
      final Varargs v$23 = env.get(pairs).invoke(LuaValue.tableOf(new LuaValue[]{aa,aaa,bb,bbb,}));
      f$8 = v$23.arg1();
      s$7 = v$23.arg(2);
      var$7 = v$23.arg(3);
      while (true) {
         v$22 = f$8.invoke(varargsOf(s$7,var$7));
         if ((var$7=v$22.arg1()).isnil()) break;
         final LuaValue k$7 = var$7;
         final LuaValue v$24 = v$22.arg(2);
         env.get(print).call(pairs3,k$7,v$24);
      }
      LuaValue f$9,s$8,var$8;
      Varargs v$25;
      final Varargs v$26 = env.get(pairs).invoke(LuaValue.tableOf(new LuaValue[]{aa,aaa,bb,bbb,},new LuaValue[]{one,two,}));
      f$9 = v$26.arg1();
      s$8 = v$26.arg(2);
      var$8 = v$26.arg(3);
      while (true) {
         v$25 = f$9.invoke(varargsOf(s$8,var$8));
         if ((var$8=v$25.arg1()).isnil()) break;
         final LuaValue k$8 = var$8;
         final LuaValue v$27 = v$25.arg(2);
         env.get(print).call(pairs4,k$8,v$27);
      }
      LuaValue f$10,s$9,var$9;
      Varargs v$28;
      final Varargs v$29 = env.get(pairs).invoke(LuaValue.tableOf(new LuaValue[]{_20,_30$1,_30,_20$1,}));
      f$10 = v$29.arg1();
      s$9 = v$29.arg(2);
      var$9 = v$29.arg(3);
      while (true) {
         v$28 = f$10.invoke(varargsOf(s$9,var$9));
         if ((var$9=v$28.arg1()).isnil()) break;
         final LuaValue k$9 = var$9;
         final LuaValue v$30 = v$28.arg(2);
         env.get(print).call(pairs5,k$9,v$30);
      }
      env.get(print).call(_G__abc_,env.get(_G).get(abc));
      env.set(abc,def);
      env.get(print).call(_G__abc_$1,env.get(_G).get(abc));
      env.get(print).invoke(varargsOf(type_nil,env.get(type$1).invoke(NIL)));
      env.get(print).invoke(varargsOf(type__a_,env.get(type$1).invoke(a)));
      env.get(print).invoke(varargsOf(type_1_,env.get(type$1).invoke(ONE)));
      env.get(print).invoke(varargsOf(type_1_5,env.get(type$1).invoke(_1_5)));
      env.get(print).invoke(varargsOf(type_fun,env.get(type$1).invoke(new ZeroArgFunction(env) {
         public LuaValue call() {
            return NONE;
         }
      })));
      env.get(print).invoke(varargsOf(type____,env.get(type$1).invoke(LuaValue.tableOf())));
      env.get(print).invoke(varargsOf(type_tru,env.get(type$1).invoke(TRUE)));
      env.get(print).invoke(varargsOf(type_fal,env.get(type$1).invoke(FALSE)));
      env.get(print).invoke(varargsOf(pcall_ty,pcall$1.invoke(varargsOf(env.get(type$1),env.get(type$1)))));
      env.get(print).invoke(varargsOf(pcall_ty$1,pcall$1.invoke(env.get(type$1))));
      env.get(print).invoke(varargsOf(_functio,new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            return new TailcallVarargs(pcall$1,env.get(type$1));
         }
      }.invoke()));
      final LuaValue la = new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            return new TailcallVarargs(pcall$1,env.get(type$1));
         }
      };
      env.get(print).invoke(varargsOf(la__,la.invoke()));
      env.set(ga,new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            return new TailcallVarargs(pcall$1,env.get(type$1));
         }
      });
      env.get(print).invoke(varargsOf(ga__,env.get(ga).invoke()));
      env.set(ta,LuaValue.tableOf(new LuaValue[]{aa1,aaa1,aa2,aaa2,}));
      env.set(tb,LuaValue.tableOf(new LuaValue[]{bb1,bbb1,bb2,bbb2,}));
      env.get(print).invoke(varargsOf(getmetat,env.get(getmetat$1).invoke(env.get(ta))));
      env.get(print).invoke(varargsOf(getmetat$2,env.get(getmetat$1).invoke(env.get(tb))));
      env.get(print).invoke(varargsOf(setmetat,env.get(type$1).invoke(env.get(setmetat$1).invoke(varargsOf(env.get(ta),LuaValue.tableOf(new LuaValue[]{cc1,ccc1,}))))));
      env.get(print).invoke(varargsOf(setmetat$2,env.get(type$1).invoke(env.get(setmetat$1).invoke(varargsOf(env.get(tb),LuaValue.tableOf(new LuaValue[]{dd1,ddd1,}))))));
      env.get(print).call(getmetat$3,env.get(getmetat$1).call(env.get(ta)).get(cc1));
      env.get(print).call(getmetat$4,env.get(getmetat$1).call(env.get(tb)).get(dd1));
      env.get(print).invoke(varargsOf(getmetat$5,env.get(getmetat$1).invoke(ONE)));
      env.get(print).invoke(varargsOf(pcall_se,pcall$1.invoke(varargsOf(env.get(setmetat$1),ONE))));
      env.get(print).invoke(varargsOf(pcall_se$1,pcall$1.invoke(varargsOf(env.get(setmetat$1),NIL))));
      env.get(print).invoke(varargsOf(pcall_se$2,pcall$1.invoke(varargsOf(env.get(setmetat$1),ABC))));
      env.get(print).invoke(varargsOf(pcall_se$3,pcall$1.invoke(varargsOf(env.get(setmetat$1),new ZeroArgFunction(env) {
         public LuaValue call() {
            return NONE;
         }
      }))));
      final LuaValue mt = LuaValue.tableOf(new LuaValue[]{aa,aaa,bb,bbb,});
      mt.set(__index,mt);
      mt.set(__newind,mt);
      final LuaValue s$10 = LuaValue.tableOf(new LuaValue[]{cc,ccc,dd,ddd,});
      final LuaValue t$2 = LuaValue.tableOf(new LuaValue[]{cc,ccc,dd,ddd,});
      env.get(setmetat$1).call(t$2,mt);
      env.get(print).invoke(varargsOf(pcall_ra,pcall$1.invoke(env.get(rawget$1))));
      env.get(print).invoke(varargsOf(pcall_ra$1,pcall$1.invoke(varargsOf(env.get(rawget$1),a))));
      env.get(print).invoke(varargsOf(pcall_ra$2,pcall$1.invoke(varargsOf(env.get(rawget$1),s$10))));
      env.get(print).invoke(varargsOf(pcall_ra$3,pcall$1.invoke(varargsOf(env.get(rawget$1),t$2))));
      env.set(printtab$1,new ZeroArgFunction(env) {
         public LuaValue call() {
            env.set(printtab,new TwoArgFunction(env) {
               public LuaValue call(LuaValue name$1,LuaValue t$3) {
                  env.get(print).invoke(varargsOf(new LuaValue[] {__$1.concat(name$1),t$3.get(aa),t$3.get(bb),t$3.get(cc),t$3.get(dd),t$3.get(ee),t$3.get(ff),},t$3.get(gg)));
                  env.get(print).invoke(varargsOf(new LuaValue[] {__$1.concat(name$1),env.get(rawget$1).call(t$3,aa),env.get(rawget$1).call(t$3,bb),env.get(rawget$1).call(t$3,cc),env.get(rawget$1).call(t$3,dd),env.get(rawget$1).call(t$3,ee),env.get(rawget$1).call(t$3,ff),},env.get(rawget$1).invoke(varargsOf(t$3,gg))));
                  return NONE;
               }
            });
            env.get(printtab).call(s$11,s$10);
            env.get(printtab).call(t,t$2);
            env.get(printtab).call(mt$1,mt);
            return NONE;
         }
      });
      env.get(printtab$1).call();
      env.get(print).invoke(varargsOf(pcall_ra$4,env.get(rawset$1).invoke(varargsOf(s$10,aa,www))));
      env.get(printtab$1).call();
      env.get(print).invoke(varargsOf(pcall_ra$5,env.get(rawset$1).invoke(varargsOf(s$10,cc,xxx))));
      env.get(printtab$1).call();
      env.get(print).invoke(varargsOf(pcall_ra$6,env.get(rawset$1).invoke(varargsOf(t$2,aa,yyy))));
      env.get(printtab$1).call();
      env.get(print).invoke(varargsOf(pcall_ra$7,env.get(rawset$1).invoke(varargsOf(t$2,dd,zzz))));
      env.get(printtab$1).call();
      env.get(printtab$1).call();
      env.get(print).call(s__ee___);
      s$10.set(ee,ppp);
      env.get(printtab$1).call();
      env.get(print).call(s__cc___);
      s$10.set(cc,qqq);
      env.get(printtab$1).call();
      env.get(print).call(t__ff___);
      t$2.set(ff,rrr);
      env.get(printtab$1).call();
      env.get(print).call(t__dd___);
      t$2.set(dd,sss);
      env.get(printtab$1).call();
      env.get(print).call(mt__gg__);
      mt.set(gg,ttt);
      env.get(printtab$1).call();
      env.get(print).invoke(varargsOf(pcall_se$4,pcall$1.invoke(env.get(select))));
      env.get(print).invoke(varargsOf(select_1,env.get(select).invoke(varargsOf(new LuaValue[] {ONE,_11,_22,_33,_44,},_55))));
      env.get(print).invoke(varargsOf(select_2,env.get(select).invoke(varargsOf(new LuaValue[] {_2,_11,_22,_33,_44,},_55))));
      env.get(print).invoke(varargsOf(select_3,env.get(select).invoke(varargsOf(new LuaValue[] {_3,_11,_22,_33,_44,},_55))));
      env.get(print).invoke(varargsOf(select_4,env.get(select).invoke(varargsOf(new LuaValue[] {_4,_11,_22,_33,_44,},_55))));
      env.get(print).invoke(varargsOf(pcall_se$5,pcall$1.invoke(varargsOf(new LuaValue[] {env.get(select),_5,_11,_22,_33,_44,},_55))));
      env.get(print).invoke(varargsOf(pcall_se$6,pcall$1.invoke(varargsOf(new LuaValue[] {env.get(select),_6,_11,_22,_33,_44,},_55))));
      env.get(print).invoke(varargsOf(pcall_se$7,pcall$1.invoke(varargsOf(new LuaValue[] {env.get(select),_7,_11,_22,_33,_44,},_55))));
      env.get(print).invoke(varargsOf(pcall_se$8,pcall$1.invoke(varargsOf(new LuaValue[] {env.get(select),ZERO,_11,_22,_33,_44,},_55))));
      env.get(print).invoke(varargsOf(pcall_se$9,pcall$1.invoke(varargsOf(new LuaValue[] {env.get(select),ONE.neg(),_11,_22,_33,_44,},_55))));
      env.get(print).invoke(varargsOf(pcall_se$10,pcall$1.invoke(varargsOf(new LuaValue[] {env.get(select),_2.neg(),_11,_22,_33,_44,},_55))));
      env.get(print).invoke(varargsOf(pcall_se$11,pcall$1.invoke(varargsOf(new LuaValue[] {env.get(select),_4.neg(),_11,_22,_33,_44,},_55))));
      env.get(print).invoke(varargsOf(pcall_se$12,pcall$1.invoke(varargsOf(new LuaValue[] {env.get(select),_5.neg(),_11,_22,_33,_44,},_55))));
      env.get(print).invoke(varargsOf(pcall_se$13,pcall$1.invoke(varargsOf(new LuaValue[] {env.get(select),_6.neg(),_11,_22,_33,_44,},_55))));
      env.get(print).invoke(varargsOf(pcall_se$14,pcall$1.invoke(varargsOf(env.get(select),ONE))));
      env.get(print).invoke(varargsOf(pcall_se$15,pcall$1.invoke(varargsOf(env.get(select),env.get(select)))));
      env.get(print).invoke(varargsOf(pcall_se$16,pcall$1.invoke(varargsOf(env.get(select),LuaValue.tableOf()))));
      env.get(print).invoke(varargsOf(pcall_se$17,pcall$1.invoke(varargsOf(new LuaValue[] {env.get(select),_2$1,_11,_22,},_33))));
      env.get(print).invoke(varargsOf(pcall_se$18,pcall$1.invoke(varargsOf(new LuaValue[] {env.get(select),abc,_11,_22,},_33))));
      env.get(print).invoke(varargsOf(pcall_to,pcall$1.invoke(env.get(tostring$1))));
      env.get(print).invoke(varargsOf(pcall_to$1,pcall$1.invoke(varargsOf(env.get(tonumber$1),NIL))));
      env.get(print).invoke(varargsOf(pcall_to$2,pcall$1.invoke(varargsOf(env.get(tonumber$1),abc))));
      env.get(print).invoke(varargsOf(pcall_to$3,pcall$1.invoke(varargsOf(env.get(tonumber$1),_123$1))));
      env.get(print).invoke(varargsOf(pcall_to$4,pcall$1.invoke(varargsOf(env.get(tonumber$1),_123$1,_10))));
      env.get(print).invoke(varargsOf(pcall_to$5,pcall$1.invoke(varargsOf(env.get(tonumber$1),_123$1,_8))));
      env.get(print).invoke(varargsOf(pcall_to$6,pcall$1.invoke(varargsOf(env.get(tonumber$1),_123$1,_6))));
      env.get(print).invoke(varargsOf(pcall_to$7,pcall$1.invoke(varargsOf(env.get(tonumber$1),_10101,_4))));
      env.get(print).invoke(varargsOf(pcall_to$8,pcall$1.invoke(varargsOf(env.get(tonumber$1),_10101,_3))));
      env.get(print).invoke(varargsOf(pcall_to$9,pcall$1.invoke(varargsOf(env.get(tonumber$1),_10101,_2))));
      env.get(print).invoke(varargsOf(pcall_to$10,pcall$1.invoke(varargsOf(env.get(tonumber$1),_1a1,_16))));
      env.get(print).invoke(varargsOf(pcall_to$11,pcall$1.invoke(varargsOf(env.get(tonumber$1),_1a1,_32))));
      env.get(print).invoke(varargsOf(pcall_to$12,pcall$1.invoke(varargsOf(env.get(tonumber$1),_1a1,_54))));
      env.get(print).invoke(varargsOf(pcall_to$13,pcall$1.invoke(varargsOf(env.get(tonumber$1),_1a1,ONE))));
      env.get(print).invoke(varargsOf(pcall_to$14,pcall$1.invoke(varargsOf(env.get(tonumber$1),_1a1,ZERO))));
      env.get(print).invoke(varargsOf(pcall_to$15,pcall$1.invoke(varargsOf(env.get(tonumber$1),_1a1,ONE.neg()))));
      env.get(print).invoke(varargsOf(pcall_to$16,pcall$1.invoke(varargsOf(env.get(tonumber$1),_1a1,_32$1))));
      env.get(print).invoke(varargsOf(pcall_to$17,pcall$1.invoke(varargsOf(env.get(tonumber$1),_123$1,_456))));
      env.get(print).invoke(varargsOf(pcall_to$18,pcall$1.invoke(varargsOf(env.get(tonumber$1),_1a1,_10))));
      env.get(print).invoke(varargsOf(pcall_to$19,pcall$1.invoke(varargsOf(env.get(tonumber$1),_151,_4))));
      env.get(print).invoke(varargsOf(pcall_to$20,pcall$1.invoke(varargsOf(env.get(tonumber$1),_151,_3))));
      env.get(print).invoke(varargsOf(pcall_to$21,pcall$1.invoke(varargsOf(env.get(tonumber$1),_151,_2))));
      env.get(print).invoke(varargsOf(pcall_to$22,pcall$1.invoke(varargsOf(new LuaValue[] {env.get(tonumber$1),_123$1,_8,},_8))));
      env.get(print).invoke(varargsOf(pcall_to$23,pcall$1.invoke(varargsOf(env.get(tonumber$1),_123))));
      env.get(print).invoke(varargsOf(pcall_to$24,pcall$1.invoke(varargsOf(env.get(tonumber$1),TRUE))));
      env.get(print).invoke(varargsOf(pcall_to$25,pcall$1.invoke(varargsOf(env.get(tonumber$1),FALSE))));
      env.get(print).invoke(varargsOf(pcall_to$26,pcall$1.invoke(varargsOf(env.get(tonumber$1),env.get(tonumber$1)))));
      env.get(print).invoke(varargsOf(pcall_to$27,pcall$1.invoke(varargsOf(env.get(tonumber$1),new ZeroArgFunction(env) {
         public LuaValue call() {
            return NONE;
         }
      }))));
      env.get(print).invoke(varargsOf(pcall_to$28,pcall$1.invoke(varargsOf(env.get(tonumber$1),LuaValue.tableOf(new LuaValue[]{a,aa,b,bb,},new LuaValue[]{one,two,})))));
      env.get(print).invoke(varargsOf(pcall_to$29,pcall$1.invoke(varargsOf(env.get(tonumber$1),_123_456))));
      env.get(print).invoke(varargsOf(pcall_to$30,pcall$1.invoke(varargsOf(env.get(tonumber$1),_123_456$1))));
      env.get(print).invoke(varargsOf(pcall_to$31,pcall$1.invoke(varargsOf(env.get(tonumber$1),_234qwer))));
      env.get(print).invoke(varargsOf(pcall_to$32,pcall$1.invoke(varargsOf(env.get(tonumber$1),_0x20))));
      env.get(print).invoke(varargsOf(pcall_to$33,pcall$1.invoke(varargsOf(env.get(tonumber$1),_0x20$1))));
      env.get(print).invoke(varargsOf(pcall_to$34,pcall$1.invoke(varargsOf(env.get(tonumber$1),_0x20_))));
      env.get(print).invoke(varargsOf(pcall_to$35,pcall$1.invoke(varargsOf(env.get(tonumber$1),_0x20_$1))));
      env.get(print).invoke(varargsOf(pcall_to$36,pcall$1.invoke(varargsOf(env.get(tonumber$1),_0X20))));
      env.get(print).invoke(varargsOf(pcall_to$37,pcall$1.invoke(varargsOf(env.get(tonumber$1),_0X20$1))));
      env.get(print).invoke(varargsOf(pcall_to$38,pcall$1.invoke(varargsOf(env.get(tonumber$1),_0X20_))));
      env.get(print).invoke(varargsOf(pcall_to$39,pcall$1.invoke(varargsOf(env.get(tonumber$1),_0X20_$1))));
      env.get(print).invoke(varargsOf(pcall_to$40,pcall$1.invoke(varargsOf(env.get(tonumber$1),_0x20,_10))));
      env.get(print).invoke(varargsOf(pcall_to$41,pcall$1.invoke(varargsOf(env.get(tonumber$1),_0x20,_16))));
      env.get(print).invoke(varargsOf(pcall_to$42,pcall$1.invoke(varargsOf(env.get(tonumber$1),_0x20,_8))));
      env.get(print).invoke(varargsOf(pcall_to$43,pcall$1.invoke(env.get(tostring$1))));
      env.get(print).invoke(varargsOf(pcall_to$44,pcall$1.invoke(varargsOf(env.get(tostring$1),NIL))));
      env.get(print).invoke(varargsOf(pcall_to$45,pcall$1.invoke(varargsOf(env.get(tostring$1),abc))));
      env.get(print).invoke(varargsOf(pcall_to$46,pcall$1.invoke(varargsOf(env.get(tostring$1),abc,def))));
      env.get(print).invoke(varargsOf(pcall_to$47,pcall$1.invoke(varargsOf(env.get(tostring$1),_123))));
      env.get(print).invoke(varargsOf(pcall_to$48,pcall$1.invoke(varargsOf(env.get(tostring$1),TRUE))));
      env.get(print).invoke(varargsOf(pcall_to$49,pcall$1.invoke(varargsOf(env.get(tostring$1),FALSE))));
      env.get(print).invoke(varargsOf(tostring$2,env.get(type$1).invoke(env.get(tostring$1).invoke(env.get(tostring$1)))));
      env.get(print).invoke(varargsOf(tostring$3,env.get(type$1).invoke(env.get(tostring$1).invoke(new ZeroArgFunction(env) {
         public LuaValue call() {
            return NONE;
         }
      }))));
      env.get(print).invoke(varargsOf(tostring$4,env.get(type$1).invoke(env.get(tostring$1).invoke(LuaValue.tableOf(new LuaValue[]{a,aa,b,bb,},new LuaValue[]{one,two,})))));
      env.get(print).invoke(varargsOf(pcall_un,pcall$1.invoke(env.get(unpack))));
      env.get(print).invoke(varargsOf(pcall_un$1,pcall$1.invoke(varargsOf(env.get(unpack),NIL))));
      env.get(print).invoke(varargsOf(pcall_un$2,pcall$1.invoke(varargsOf(env.get(unpack),abc))));
      env.get(print).invoke(varargsOf(pcall_un$3,pcall$1.invoke(varargsOf(env.get(unpack),ONE))));
      env.get(print).invoke(varargsOf(unpack__,env.get(unpack).invoke(LuaValue.listOf(new LuaValue[]{aa,}))));
      env.get(print).invoke(varargsOf(unpack__$1,env.get(unpack).invoke(LuaValue.listOf(new LuaValue[]{aa,bb,}))));
      env.get(print).invoke(varargsOf(unpack__$2,env.get(unpack).invoke(LuaValue.listOf(new LuaValue[]{aa,bb,cc,}))));
      final LuaValue t$3 = LuaValue.listOf(new LuaValue[]{aa,bb,cc,dd,ee,ff,});
      env.get(print).invoke(varargsOf(pcall_un$4,pcall$1.invoke(varargsOf(env.get(unpack),t$3))));
      env.get(print).invoke(varargsOf(pcall_un$5,pcall$1.invoke(varargsOf(env.get(unpack),t$3,_2))));
      env.get(print).invoke(varargsOf(pcall_un$6,pcall$1.invoke(varargsOf(new LuaValue[] {env.get(unpack),t$3,_2,},_5))));
      env.get(print).invoke(varargsOf(pcall_un$7,pcall$1.invoke(varargsOf(new LuaValue[] {env.get(unpack),t$3,_2,},_6))));
      env.get(print).invoke(varargsOf(pcall_un$8,pcall$1.invoke(varargsOf(new LuaValue[] {env.get(unpack),t$3,_2,},_7))));
      env.get(print).invoke(varargsOf(pcall_un$9,pcall$1.invoke(varargsOf(env.get(unpack),t$3,ONE))));
      env.get(print).invoke(varargsOf(pcall_un$10,pcall$1.invoke(varargsOf(new LuaValue[] {env.get(unpack),t$3,ONE,},_5))));
      env.get(print).invoke(varargsOf(pcall_un$11,pcall$1.invoke(varargsOf(new LuaValue[] {env.get(unpack),t$3,ONE,},_6))));
      env.get(print).invoke(varargsOf(pcall_un$12,pcall$1.invoke(varargsOf(new LuaValue[] {env.get(unpack),t$3,ONE,},_7))));
      env.get(print).invoke(varargsOf(pcall_un$13,pcall$1.invoke(varargsOf(env.get(unpack),t$3,ZERO))));
      env.get(print).invoke(varargsOf(pcall_un$14,pcall$1.invoke(varargsOf(new LuaValue[] {env.get(unpack),t$3,ZERO,},_5))));
      env.get(print).invoke(varargsOf(pcall_un$15,pcall$1.invoke(varargsOf(new LuaValue[] {env.get(unpack),t$3,ZERO,},_6))));
      env.get(print).invoke(varargsOf(pcall_un$16,pcall$1.invoke(varargsOf(new LuaValue[] {env.get(unpack),t$3,ZERO,},_7))));
      env.get(print).invoke(varargsOf(pcall_un$17,pcall$1.invoke(varargsOf(env.get(unpack),t$3,ONE.neg()))));
      env.get(print).invoke(varargsOf(pcall_un$18,pcall$1.invoke(varargsOf(new LuaValue[] {env.get(unpack),t$3,ONE.neg(),},_5))));
      env.get(print).invoke(varargsOf(pcall_un$19,pcall$1.invoke(varargsOf(new LuaValue[] {env.get(unpack),t$3,ONE.neg(),},_6))));
      env.get(print).invoke(varargsOf(pcall_un$20,pcall$1.invoke(varargsOf(new LuaValue[] {env.get(unpack),t$3,ONE.neg(),},_7))));
      env.get(print).invoke(varargsOf(pcall_un$21,pcall$1.invoke(varargsOf(new LuaValue[] {env.get(unpack),t$3,_2,},_4))));
      env.get(print).invoke(varargsOf(pcall_un$6,pcall$1.invoke(varargsOf(new LuaValue[] {env.get(unpack),t$3,_2,},_5))));
      env.get(print).invoke(varargsOf(pcall_un$7,pcall$1.invoke(varargsOf(new LuaValue[] {env.get(unpack),t$3,_2,},_6))));
      env.get(print).invoke(varargsOf(pcall_un$8,pcall$1.invoke(varargsOf(new LuaValue[] {env.get(unpack),t$3,_2,},_7))));
      env.get(print).invoke(varargsOf(pcall_un$22,pcall$1.invoke(varargsOf(new LuaValue[] {env.get(unpack),t$3,_2,},_8))));
      env.get(print).invoke(varargsOf(pcall_un$23,pcall$1.invoke(varargsOf(new LuaValue[] {env.get(unpack),t$3,_2,},ZERO))));
      env.get(print).invoke(varargsOf(pcall_un$24,pcall$1.invoke(varargsOf(new LuaValue[] {env.get(unpack),t$3,_2,},ZERO))));
      env.get(print).invoke(varargsOf(pcall_un$25,pcall$1.invoke(varargsOf(new LuaValue[] {env.get(unpack),t$3,_2,},ZERO))));
      env.get(print).invoke(varargsOf(pcall_un$26,pcall$1.invoke(varargsOf(new LuaValue[] {env.get(unpack),t$3,_2,},ONE.neg()))));
      t$3.set(ZERO,zz);
      t$3.set(ONE.neg(),yy);
      t$3.set(_2.neg(),xx);
      env.get(print).invoke(varargsOf(pcall_un$13,pcall$1.invoke(varargsOf(env.get(unpack),t$3,ZERO))));
      env.get(print).invoke(varargsOf(pcall_un$25,pcall$1.invoke(varargsOf(new LuaValue[] {env.get(unpack),t$3,_2,},ZERO))));
      env.get(print).invoke(varargsOf(pcall_un$26,pcall$1.invoke(varargsOf(new LuaValue[] {env.get(unpack),t$3,_2,},ONE.neg()))));
      env.get(print).invoke(varargsOf(pcall_un$27,pcall$1.invoke(varargsOf(env.get(unpack),t$3,_3$1))));
      env.get(print).invoke(varargsOf(pcall_un$28,pcall$1.invoke(varargsOf(env.get(unpack),t$3,a))));
      env.get(print).invoke(varargsOf(pcall_un$29,pcall$1.invoke(varargsOf(env.get(unpack),t$3,new ZeroArgFunction(env) {
         public LuaValue call() {
            return NONE;
         }
      }))));
      env.get(print).invoke(varargsOf(_VERSION,env.get(type$1).invoke(env.get(_VERSION))));
      final LuaValue errfunc = new OneArgFunction(env) {
         public LuaValue call(LuaValue detail) {
            env.get(print).invoke(varargsOf(__in_err,env.get(type$1).invoke(detail)));
            return response;
         }
      };
      final LuaValue badfunc = new ZeroArgFunction(env) {
         public LuaValue call() {
            env.get(error$1).call(error_fr);
            return NONE;
         }
      };
      final LuaValue wrappedbad = new ZeroArgFunction(env) {
         public LuaValue call() {
            pcall$1.call(badfunc);
            return NONE;
         }
      };
      env.get(print).invoke(varargsOf(pcall_ba,pcall$1.invoke(badfunc)));
      env.get(print).invoke(varargsOf(pcall_ba$1,pcall$1.invoke(varargsOf(badfunc,errfunc))));
      env.get(print).invoke(varargsOf(pcall_ba$2,pcall$1.invoke(varargsOf(badfunc,badfunc))));
      env.get(print).invoke(varargsOf(pcall_wr,pcall$1.invoke(wrappedbad)));
      env.get(print).invoke(varargsOf(pcall_wr$1,pcall$1.invoke(varargsOf(wrappedbad,errfunc))));
      env.get(print).invoke(varargsOf(pcall_xp,pcall$1.invoke(varargsOf(env.get(xpcall),badfunc))));
      env.get(print).invoke(varargsOf(pcall_xp$1,pcall$1.invoke(varargsOf(env.get(xpcall),badfunc,errfunc))));
      env.get(print).invoke(varargsOf(pcall_xp$2,pcall$1.invoke(varargsOf(env.get(xpcall),badfunc,badfunc))));
      env.get(print).invoke(varargsOf(pcall_xp$3,pcall$1.invoke(varargsOf(env.get(xpcall),wrappedbad))));
      env.get(print).invoke(varargsOf(xpcall_w,env.get(xpcall).invoke(varargsOf(wrappedbad,errfunc))));
      return NONE;
   }
   static final LuaValue tostring$1 = valueOf("tostring");
   static final LuaValue table = valueOf("table");
   static final LuaValue tbl = valueOf("tbl");
   static final LuaValue thread = valueOf("thread");
   static final LuaValue thr = valueOf("thr");
   static final LuaValue userdata = valueOf("userdata");
   static final LuaValue uda = valueOf("uda");
   static final LuaValue function = valueOf("function");
   static final LuaValue func = valueOf("func");
   static final LuaValue type$1 = valueOf("type");
   static final LuaValue _ = valueOf(".");
   static final LuaValue pcall = valueOf("pcall");
   static final LuaValue print = valueOf("print");
   static final LuaValue _11 = valueOf(11);
   static final LuaValue abc = valueOf("abc");
   static final LuaValue _123 = valueOf(123);
   static final LuaValue pqr = valueOf("pqr");
   static final LuaValue T = valueOf("T");
   static final LuaValue F = valueOf("F");
   static final LuaValue assert_t = valueOf("assert(true)");
   static final LuaValue assert$1 = valueOf("assert");
   static final LuaValue pcall_as = valueOf("pcall(assert,true)");
   static final LuaValue pcall_as$1 = valueOf("pcall(assert,false)");
   static final LuaValue pcall_as$2 = valueOf("pcall(assert,nil)");
   static final LuaValue pcall_as$3 = valueOf("pcall(assert,true,\"msg\")");
   static final LuaValue msg = valueOf("msg");
   static final LuaValue pcall_as$4 = valueOf("pcall(assert,false,\"msg\")");
   static final LuaValue pcall_as$5 = valueOf("pcall(assert,nil,\"msg\")");
   static final LuaValue pcall_as$6 = valueOf("pcall(assert,false,\"msg\",\"msg2\")");
   static final LuaValue msg2 = valueOf("msg2");
   static final LuaValue collectg = valueOf("collectgarbage(\"count\")");
   static final LuaValue collectg$1 = valueOf("collectgarbage");
   static final LuaValue count = valueOf("count");
   static final LuaValue collectg$2 = valueOf("collectgarbage(\"collect\")");
   static final LuaValue collect = valueOf("collect");
   static final LuaValue pcall_ip = valueOf("pcall(ipairs)");
   static final LuaValue ipairs = valueOf("ipairs");
   static final LuaValue pcall_ip$1 = valueOf("pcall(ipairs,nil)");
   static final LuaValue pcall_ip$2 = valueOf("pcall(ipairs,\"a\")");
   static final LuaValue a = valueOf("a");
   static final LuaValue pcall_ip$3 = valueOf("pcall(ipairs,1)");
   static final LuaValue ipairs1 = valueOf("ipairs1");
   static final LuaValue one = valueOf("one");
   static final LuaValue two = valueOf("two");
   static final LuaValue ipairs2 = valueOf("ipairs2");
   static final LuaValue aa = valueOf("aa");
   static final LuaValue aaa = valueOf("aaa");
   static final LuaValue bb = valueOf("bb");
   static final LuaValue bbb = valueOf("bbb");
   static final LuaValue ipairs3 = valueOf("ipairs3");
   static final LuaValue ipairs4 = valueOf("ipairs4");
   static final LuaValue _30 = valueOf(30);
   static final LuaValue _30$1 = valueOf("30");
   static final LuaValue _20 = valueOf(20);
   static final LuaValue _20$1 = valueOf("20");
   static final LuaValue ipairs5 = valueOf("ipairs5");
   static final LuaValue print_ = valueOf("print ");
   static final LuaValue _table_ = valueOf("'table ");
   static final LuaValue loaded_ = valueOf("loaded'");
   static final LuaValue _$1 = valueOf("");
   static final LuaValue _print_a = valueOf(" print'after empty string'");
   static final LuaValue t = valueOf("t");
   static final LuaValue i = valueOf("i");
   static final LuaValue f$5 = valueOf("f");
   static final LuaValue load$1 = valueOf("load");
   static final LuaValue c = valueOf("c");
   static final LuaValue e = valueOf("e");
   static final LuaValue load__ = valueOf("load: ");
   static final LuaValue load_fai = valueOf("load failed:");
   static final LuaValue loadstri = valueOf("loadstring");
   static final LuaValue print_3_ = valueOf("print(3+4); return 8");
   static final LuaValue loadstri$1 = valueOf("loadstring(\"");
   static final LuaValue __ = valueOf("\")");
   static final LuaValue ____ = valueOf("\")()");
   static final LuaValue pcall_pa = valueOf("pcall(pairs)");
   static final LuaValue pairs = valueOf("pairs");
   static final LuaValue pcall_pa$1 = valueOf("pcall(pairs,nil)");
   static final LuaValue pcall_pa$2 = valueOf("pcall(pairs,\"a\")");
   static final LuaValue pcall_pa$3 = valueOf("pcall(pairs,1)");
   static final LuaValue pairs1 = valueOf("pairs1");
   static final LuaValue pairs2 = valueOf("pairs2");
   static final LuaValue pairs3 = valueOf("pairs3");
   static final LuaValue pairs4 = valueOf("pairs4");
   static final LuaValue pairs5 = valueOf("pairs5");
   static final LuaValue _G__abc_ = valueOf("_G[\"abc\"] (before)");
   static final LuaValue _G = valueOf("_G");
   static final LuaValue def = valueOf("def");
   static final LuaValue _G__abc_$1 = valueOf("_G[\"abc\"] (after)");
   static final LuaValue type_nil = valueOf("type(nil)");
   static final LuaValue type__a_ = valueOf("type(\"a\")");
   static final LuaValue type_1_ = valueOf("type(1)");
   static final LuaValue type_1_5 = valueOf("type(1.5)");
   static final LuaValue _1_5 = valueOf(1.5);
   static final LuaValue type_fun = valueOf("type(function() end)");
   static final LuaValue type____ = valueOf("type({})");
   static final LuaValue type_tru = valueOf("type(true)");
   static final LuaValue type_fal = valueOf("type(false)");
   static final LuaValue pcall_ty = valueOf("pcall(type,type)");
   static final LuaValue pcall_ty$1 = valueOf("pcall(type)");
   static final LuaValue _functio = valueOf("(function() return pcall(type) end)()");
   static final LuaValue la__ = valueOf("la()");
   static final LuaValue ga = valueOf("ga");
   static final LuaValue ga__ = valueOf("ga()");
   static final LuaValue aa1 = valueOf("aa1");
   static final LuaValue aaa1 = valueOf("aaa1");
   static final LuaValue aa2 = valueOf("aa2");
   static final LuaValue aaa2 = valueOf("aaa2");
   static final LuaValue ta = valueOf("ta");
   static final LuaValue bb1 = valueOf("bb1");
   static final LuaValue bbb1 = valueOf("bbb1");
   static final LuaValue bb2 = valueOf("bb2");
   static final LuaValue bbb2 = valueOf("bbb2");
   static final LuaValue tb = valueOf("tb");
   static final LuaValue getmetat = valueOf("getmetatable(ta)");
   static final LuaValue getmetat$1 = valueOf("getmetatable");
   static final LuaValue getmetat$2 = valueOf("getmetatable(tb)");
   static final LuaValue setmetat = valueOf("setmetatable(ta),{cc1=\"ccc1\"}");
   static final LuaValue setmetat$1 = valueOf("setmetatable");
   static final LuaValue cc1 = valueOf("cc1");
   static final LuaValue ccc1 = valueOf("ccc1");
   static final LuaValue setmetat$2 = valueOf("setmetatable(tb),{dd1=\"ddd1\"}");
   static final LuaValue dd1 = valueOf("dd1");
   static final LuaValue ddd1 = valueOf("ddd1");
   static final LuaValue getmetat$3 = valueOf("getmetatable(ta)[\"cc1\"]");
   static final LuaValue getmetat$4 = valueOf("getmetatable(tb)[\"dd1\"]");
   static final LuaValue getmetat$5 = valueOf("getmetatable(1)");
   static final LuaValue pcall_se = valueOf("pcall(setmetatable,1)");
   static final LuaValue pcall_se$1 = valueOf("pcall(setmetatable,nil)");
   static final LuaValue pcall_se$2 = valueOf("pcall(setmetatable,\"ABC\")");
   static final LuaValue ABC = valueOf("ABC");
   static final LuaValue pcall_se$3 = valueOf("pcall(setmetatable,function() end)");
   static final LuaValue __index = valueOf("__index");
   static final LuaValue __newind = valueOf("__newindex");
   static final LuaValue cc = valueOf("cc");
   static final LuaValue ccc = valueOf("ccc");
   static final LuaValue dd = valueOf("dd");
   static final LuaValue ddd = valueOf("ddd");
   static final LuaValue pcall_ra = valueOf("pcall(rawget)");
   static final LuaValue rawget$1 = valueOf("rawget");
   static final LuaValue pcall_ra$1 = valueOf("pcall(rawget,\"a\")");
   static final LuaValue pcall_ra$2 = valueOf("pcall(rawget,s)");
   static final LuaValue pcall_ra$3 = valueOf("pcall(rawget,t)");
   static final LuaValue __$1 = valueOf("  ");
   static final LuaValue ee = valueOf("ee");
   static final LuaValue ff = valueOf("ff");
   static final LuaValue gg = valueOf("gg");
   static final LuaValue printtab = valueOf("printtable");
   static final LuaValue s$11 = valueOf("s");
   static final LuaValue mt$1 = valueOf("mt");
   static final LuaValue printtab$1 = valueOf("printtables");
   static final LuaValue pcall_ra$4 = valueOf("pcall(rawset,s,\"aa\",\"www\")");
   static final LuaValue rawset$1 = valueOf("rawset");
   static final LuaValue www = valueOf("www");
   static final LuaValue pcall_ra$5 = valueOf("pcall(rawset,s,\"cc\",\"xxx\")");
   static final LuaValue xxx = valueOf("xxx");
   static final LuaValue pcall_ra$6 = valueOf("pcall(rawset,t,\"aa\",\"yyy\")");
   static final LuaValue yyy = valueOf("yyy");
   static final LuaValue pcall_ra$7 = valueOf("pcall(rawset,t,\"dd\",\"zzz\")");
   static final LuaValue zzz = valueOf("zzz");
   static final LuaValue s__ee___ = valueOf("s[\"ee\"]=\"ppp\"");
   static final LuaValue ppp = valueOf("ppp");
   static final LuaValue s__cc___ = valueOf("s[\"cc\"]=\"qqq\"");
   static final LuaValue qqq = valueOf("qqq");
   static final LuaValue t__ff___ = valueOf("t[\"ff\"]=\"rrr\"");
   static final LuaValue rrr = valueOf("rrr");
   static final LuaValue t__dd___ = valueOf("t[\"dd\"]=\"sss\"");
   static final LuaValue sss = valueOf("sss");
   static final LuaValue mt__gg__ = valueOf("mt[\"gg\"]=\"ttt\"");
   static final LuaValue ttt = valueOf("ttt");
   static final LuaValue pcall_se$4 = valueOf("pcall(select)");
   static final LuaValue select = valueOf("select");
   static final LuaValue select_1 = valueOf("select(1,11,22,33,44,55)");
   static final LuaValue _22 = valueOf(22);
   static final LuaValue _33 = valueOf(33);
   static final LuaValue _44 = valueOf(44);
   static final LuaValue _55 = valueOf(55);
   static final LuaValue select_2 = valueOf("select(2,11,22,33,44,55)");
   static final LuaValue _2 = valueOf(2);
   static final LuaValue select_3 = valueOf("select(3,11,22,33,44,55)");
   static final LuaValue _3 = valueOf(3);
   static final LuaValue select_4 = valueOf("select(4,11,22,33,44,55)");
   static final LuaValue _4 = valueOf(4);
   static final LuaValue pcall_se$5 = valueOf("pcall(select,5,11,22,33,44,55)");
   static final LuaValue _5 = valueOf(5);
   static final LuaValue pcall_se$6 = valueOf("pcall(select,6,11,22,33,44,55)");
   static final LuaValue _6 = valueOf(6);
   static final LuaValue pcall_se$7 = valueOf("pcall(select,7,11,22,33,44,55)");
   static final LuaValue _7 = valueOf(7);
   static final LuaValue pcall_se$8 = valueOf("pcall(select,0,11,22,33,44,55)");
   static final LuaValue pcall_se$9 = valueOf("pcall(select,-1,11,22,33,44,55)");
   static final LuaValue pcall_se$10 = valueOf("pcall(select,-2,11,22,33,44,55)");
   static final LuaValue pcall_se$11 = valueOf("pcall(select,-4,11,22,33,44,55)");
   static final LuaValue pcall_se$12 = valueOf("pcall(select,-5,11,22,33,44,55)");
   static final LuaValue pcall_se$13 = valueOf("pcall(select,-6,11,22,33,44,55)");
   static final LuaValue pcall_se$14 = valueOf("pcall(select,1)");
   static final LuaValue pcall_se$15 = valueOf("pcall(select,select)");
   static final LuaValue pcall_se$16 = valueOf("pcall(select,{})");
   static final LuaValue pcall_se$17 = valueOf("pcall(select,\"2\",11,22,33)");
   static final LuaValue _2$1 = valueOf("2");
   static final LuaValue pcall_se$18 = valueOf("pcall(select,\"abc\",11,22,33)");
   static final LuaValue pcall_to = valueOf("pcall(tonumber)");
   static final LuaValue pcall_to$1 = valueOf("pcall(tonumber,nil)");
   static final LuaValue tonumber$1 = valueOf("tonumber");
   static final LuaValue pcall_to$2 = valueOf("pcall(tonumber,\"abc\")");
   static final LuaValue pcall_to$3 = valueOf("pcall(tonumber,\"123\")");
   static final LuaValue _123$1 = valueOf("123");
   static final LuaValue pcall_to$4 = valueOf("pcall(tonumber,\"123\",10)");
   static final LuaValue _10 = valueOf(10);
   static final LuaValue pcall_to$5 = valueOf("pcall(tonumber,\"123\",8)");
   static final LuaValue _8 = valueOf(8);
   static final LuaValue pcall_to$6 = valueOf("pcall(tonumber,\"123\",6)");
   static final LuaValue pcall_to$7 = valueOf("pcall(tonumber,\"10101\",4)");
   static final LuaValue _10101 = valueOf("10101");
   static final LuaValue pcall_to$8 = valueOf("pcall(tonumber,\"10101\",3)");
   static final LuaValue pcall_to$9 = valueOf("pcall(tonumber,\"10101\",2)");
   static final LuaValue pcall_to$10 = valueOf("pcall(tonumber,\"1a1\",16)");
   static final LuaValue _1a1 = valueOf("1a1");
   static final LuaValue _16 = valueOf(16);
   static final LuaValue pcall_to$11 = valueOf("pcall(tonumber,\"1a1\",32)");
   static final LuaValue _32 = valueOf(32);
   static final LuaValue pcall_to$12 = valueOf("pcall(tonumber,\"1a1\",54)");
   static final LuaValue _54 = valueOf(54);
   static final LuaValue pcall_to$13 = valueOf("pcall(tonumber,\"1a1\",1)");
   static final LuaValue pcall_to$14 = valueOf("pcall(tonumber,\"1a1\",0)");
   static final LuaValue pcall_to$15 = valueOf("pcall(tonumber,\"1a1\",-1)");
   static final LuaValue pcall_to$16 = valueOf("pcall(tonumber,\"1a1\",\"32\")");
   static final LuaValue _32$1 = valueOf("32");
   static final LuaValue pcall_to$17 = valueOf("pcall(tonumber,\"123\",\"456\")");
   static final LuaValue _456 = valueOf("456");
   static final LuaValue pcall_to$18 = valueOf("pcall(tonumber,\"1a1\",10)");
   static final LuaValue pcall_to$19 = valueOf("pcall(tonumber,\"151\",4)");
   static final LuaValue _151 = valueOf("151");
   static final LuaValue pcall_to$20 = valueOf("pcall(tonumber,\"151\",3)");
   static final LuaValue pcall_to$21 = valueOf("pcall(tonumber,\"151\",2)");
   static final LuaValue pcall_to$22 = valueOf("pcall(tonumber,\"123\",8,8)");
   static final LuaValue pcall_to$23 = valueOf("pcall(tonumber,123)");
   static final LuaValue pcall_to$24 = valueOf("pcall(tonumber,true)");
   static final LuaValue pcall_to$25 = valueOf("pcall(tonumber,false)");
   static final LuaValue pcall_to$26 = valueOf("pcall(tonumber,tonumber)");
   static final LuaValue pcall_to$27 = valueOf("pcall(tonumber,function() end)");
   static final LuaValue pcall_to$28 = valueOf("pcall(tonumber,{\"one\",\"two\",a=\"aa\",b=\"bb\"})");
   static final LuaValue b = valueOf("b");
   static final LuaValue pcall_to$29 = valueOf("pcall(tonumber,\"123.456\")");
   static final LuaValue _123_456 = valueOf("123.456");
   static final LuaValue pcall_to$30 = valueOf("pcall(tonumber,\" 123.456\")");
   static final LuaValue _123_456$1 = valueOf(" 123.456");
   static final LuaValue pcall_to$31 = valueOf("pcall(tonumber,\" 234qwer\")");
   static final LuaValue _234qwer = valueOf(" 234qwer");
   static final LuaValue pcall_to$32 = valueOf("pcall(tonumber,\"0x20\")");
   static final LuaValue _0x20 = valueOf("0x20");
   static final LuaValue pcall_to$33 = valueOf("pcall(tonumber,\" 0x20\")");
   static final LuaValue _0x20$1 = valueOf(" 0x20");
   static final LuaValue pcall_to$34 = valueOf("pcall(tonumber,\"0x20 \")");
   static final LuaValue _0x20_ = valueOf("0x20 ");
   static final LuaValue pcall_to$35 = valueOf("pcall(tonumber,\" 0x20 \")");
   static final LuaValue _0x20_$1 = valueOf(" 0x20 ");
   static final LuaValue pcall_to$36 = valueOf("pcall(tonumber,\"0X20\")");
   static final LuaValue _0X20 = valueOf("0X20");
   static final LuaValue pcall_to$37 = valueOf("pcall(tonumber,\" 0X20\")");
   static final LuaValue _0X20$1 = valueOf(" 0X20");
   static final LuaValue pcall_to$38 = valueOf("pcall(tonumber,\"0X20 \")");
   static final LuaValue _0X20_ = valueOf("0X20 ");
   static final LuaValue pcall_to$39 = valueOf("pcall(tonumber,\" 0X20 \")");
   static final LuaValue _0X20_$1 = valueOf(" 0X20 ");
   static final LuaValue pcall_to$40 = valueOf("pcall(tonumber,\"0x20\",10)");
   static final LuaValue pcall_to$41 = valueOf("pcall(tonumber,\"0x20\",16)");
   static final LuaValue pcall_to$42 = valueOf("pcall(tonumber,\"0x20\",8)");
   static final LuaValue pcall_to$43 = valueOf("pcall(tostring)");
   static final LuaValue pcall_to$44 = valueOf("pcall(tostring,nil)");
   static final LuaValue pcall_to$45 = valueOf("pcall(tostring,\"abc\")");
   static final LuaValue pcall_to$46 = valueOf("pcall(tostring,\"abc\",\"def\")");
   static final LuaValue pcall_to$47 = valueOf("pcall(tostring,123)");
   static final LuaValue pcall_to$48 = valueOf("pcall(tostring,true)");
   static final LuaValue pcall_to$49 = valueOf("pcall(tostring,false)");
   static final LuaValue tostring$2 = valueOf("tostring(tostring)");
   static final LuaValue tostring$3 = valueOf("tostring(function() end)");
   static final LuaValue tostring$4 = valueOf("tostring({\"one\",\"two\",a=\"aa\",b=\"bb\"})");
   static final LuaValue pcall_un = valueOf("pcall(unpack)");
   static final LuaValue unpack = valueOf("unpack");
   static final LuaValue pcall_un$1 = valueOf("pcall(unpack,nil)");
   static final LuaValue pcall_un$2 = valueOf("pcall(unpack,\"abc\")");
   static final LuaValue pcall_un$3 = valueOf("pcall(unpack,1)");
   static final LuaValue unpack__ = valueOf("unpack({\"aa\"})");
   static final LuaValue unpack__$1 = valueOf("unpack({\"aa\",\"bb\"})");
   static final LuaValue unpack__$2 = valueOf("unpack({\"aa\",\"bb\",\"cc\"})");
   static final LuaValue pcall_un$4 = valueOf("pcall(unpack,t)");
   static final LuaValue pcall_un$5 = valueOf("pcall(unpack,t,2)");
   static final LuaValue pcall_un$6 = valueOf("pcall(unpack,t,2,5)");
   static final LuaValue pcall_un$7 = valueOf("pcall(unpack,t,2,6)");
   static final LuaValue pcall_un$8 = valueOf("pcall(unpack,t,2,7)");
   static final LuaValue pcall_un$9 = valueOf("pcall(unpack,t,1)");
   static final LuaValue pcall_un$10 = valueOf("pcall(unpack,t,1,5)");
   static final LuaValue pcall_un$11 = valueOf("pcall(unpack,t,1,6)");
   static final LuaValue pcall_un$12 = valueOf("pcall(unpack,t,1,7)");
   static final LuaValue pcall_un$13 = valueOf("pcall(unpack,t,0)");
   static final LuaValue pcall_un$14 = valueOf("pcall(unpack,t,0,5)");
   static final LuaValue pcall_un$15 = valueOf("pcall(unpack,t,0,6)");
   static final LuaValue pcall_un$16 = valueOf("pcall(unpack,t,0,7)");
   static final LuaValue pcall_un$17 = valueOf("pcall(unpack,t,-1)");
   static final LuaValue pcall_un$18 = valueOf("pcall(unpack,t,-1,5)");
   static final LuaValue pcall_un$19 = valueOf("pcall(unpack,t,-1,6)");
   static final LuaValue pcall_un$20 = valueOf("pcall(unpack,t,-1,7)");
   static final LuaValue pcall_un$21 = valueOf("pcall(unpack,t,2,4)");
   static final LuaValue pcall_un$22 = valueOf("pcall(unpack,t,2,8)");
   static final LuaValue pcall_un$23 = valueOf("pcall(unpack,t,2,2)");
   static final LuaValue pcall_un$24 = valueOf("pcall(unpack,t,2,1)");
   static final LuaValue pcall_un$25 = valueOf("pcall(unpack,t,2,0)");
   static final LuaValue pcall_un$26 = valueOf("pcall(unpack,t,2,-1)");
   static final LuaValue zz = valueOf("zz");
   static final LuaValue yy = valueOf("yy");
   static final LuaValue xx = valueOf("xx");
   static final LuaValue pcall_un$27 = valueOf("pcall(unpack,t,\"3\")");
   static final LuaValue _3$1 = valueOf("3");
   static final LuaValue pcall_un$28 = valueOf("pcall(unpack,t,\"a\")");
   static final LuaValue pcall_un$29 = valueOf("pcall(unpack,t,function() end)");
   static final LuaValue _VERSION = valueOf("_VERSION");
   static final LuaValue __in_err = valueOf("  in errfunc");
   static final LuaValue response = valueOf("response-from-xpcall");
   static final LuaValue error$1 = valueOf("error");
   static final LuaValue error_fr = valueOf("error-from-badfunc");
   static final LuaValue pcall_ba = valueOf("pcall(badfunc)");
   static final LuaValue pcall_ba$1 = valueOf("pcall(badfunc,errfunc)");
   static final LuaValue pcall_ba$2 = valueOf("pcall(badfunc,badfunc)");
   static final LuaValue pcall_wr = valueOf("pcall(wrappedbad)");
   static final LuaValue pcall_wr$1 = valueOf("pcall(wrappedbad,errfunc)");
   static final LuaValue pcall_xp = valueOf("pcall(xpcall(badfunc))");
   static final LuaValue xpcall = valueOf("xpcall");
   static final LuaValue pcall_xp$1 = valueOf("pcall(xpcall(badfunc,errfunc))");
   static final LuaValue pcall_xp$2 = valueOf("pcall(xpcall(badfunc,badfunc))");
   static final LuaValue pcall_xp$3 = valueOf("pcall(xpcall(wrappedbad))");
   static final LuaValue xpcall_w = valueOf("xpcall(wrappedbad,errfunc)");
}