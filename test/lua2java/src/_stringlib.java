import org.luaj.vm2.*;
import org.luaj.vm2.lib.*;
public class _stringlib extends VarArgFunction {
   public Varargs onInvoke(Varargs $arg) {
      env.get(print).invoke(env.get(string).get(find).invoke(varargsOf(new LuaValue[] {_12345678,_,ZERO,},TRUE)));
      env.get(print).invoke(env.get(string).get(find).invoke(varargsOf(alo_alx_,_______1)));
      env.get(print).invoke(env.get(string).get(find).invoke(varargsOf(aloALO,_l_)));
      env.get(print).invoke(env.get(string).get(find).invoke(varargsOf(___isto_,_S_S_)));
      env.get(print).invoke(env.get(string).get(find).invoke(varargsOf(_$1,_$1)));
      env.get(print).invoke(env.get(string).get(find).invoke(varargsOf(ababaabb,abb)));
      env.get(print).invoke(env.get(string).get(find).invoke(varargsOf(ababaabb,abb,_7)));
      env.get(print).invoke(env.get(string).get(match).invoke(varargsOf(aabaa,a_)));
      env.get(print).invoke(env.get(string).get(match).invoke(varargsOf(aabaa,a_,_3)));
      env.get(print).invoke(env.get(string).get(match).invoke(varargsOf(aabaa,a_b)));
      env.get(print).invoke(env.get(string).get(match).invoke(varargsOf(aabaa,a_b,_3)));
      env.get(print).invoke(env.get(string).get(match).invoke(varargsOf(abbaaaba,b_a__b)));
      env.get(print).invoke(env.get(string).get(match).invoke(varargsOf(abbaaaba,b_a____b)));
      env.get(print).invoke(env.get(string).get(match).invoke(varargsOf(abbaaaba,b_a____b,_3)));
      env.get(print).invoke(env.get(string).get(match).invoke(varargsOf(abbaaaba,b_a____b,_8)));
      env.get(print).invoke(env.get(string).get(match).invoke(varargsOf(abbaaaba,b_a____b,_12)));
      env.get(print).invoke(env.get(string).get(byte$1).invoke(varargsOf(hi,_3.neg())));
      env.get(print).invoke(env.get(string).get(gsub).invoke(varargsOf(ABC,___x__,new OneArgFunction(env) {
         public LuaValue call(LuaValue s) {
            return _abcd;
         }
      })));
      env.get(print).invoke(env.get(string).get(gsub).invoke(varargsOf(_123,___x__,new OneArgFunction(env) {
         public LuaValue call(LuaValue s) {
            return _abcd;
         }
      })));
      env.get(print).invoke(env.get(string).get(gsub).invoke(varargsOf(ABC_123,___x__,new OneArgFunction(env) {
         public LuaValue call(LuaValue s) {
            return _abcd;
         }
      })));
      env.get(print).invoke(env.get(string).get(gsub).invoke(varargsOf(ABC_123_,___x__,new OneArgFunction(env) {
         public LuaValue call(LuaValue s) {
            return _abcd;
         }
      })));
      env.get(print).invoke(env.get(string).get(gsub).invoke(varargsOf(ABC_123_$1,___x__,new OneArgFunction(env) {
         public LuaValue call(LuaValue s) {
            return _abcd;
         }
      })));
      env.get(print).invoke(env.get(string).get(gsub).invoke(varargsOf(ABC_123_$1,___x__,new OneArgFunction(env) {
         public LuaValue call(LuaValue s) {
            return _ab;
         }
      })));
      env.get(print).invoke(env.get(tostring$1).invoke(_1_234567));
      env.get(print).invoke(env.get(tostring$1).invoke(_1_234567$1));
      env.get(print).invoke(env.get(tostring$1).invoke(_1_234567$2));
      env.set(f1,new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            final LuaValue s = $arg.arg1();
            LuaValue p = $arg.arg(2);
            env.get(print).call(p);
            p = env.get(string).get(gsub).call(p,____0_9_,new OneArgFunction(env) {
               public LuaValue call(LuaValue s$1) {
                  return _$2.concat(valueOf(s$1.checkdouble()+1));
               }
            });
            env.get(print).call(p);
            p = env.get(string).get(gsub).invoke(varargsOf(new LuaValue[] {p,_____,_1__,},ONE)).arg1();
            env.get(print).call(p);
            p = env.get(string).get(gsub).invoke(varargsOf(new LuaValue[] {p,_____$1,___1,},ONE)).arg1();
            env.get(print).call(p);
            final LuaValue t = LuaValue.listOf(new LuaValue[]{}, env.get(string).get(match).invoke(varargsOf(s,p)));
            return new TailcallVarargs(env.get(string).get(sub$1),varargsOf(s,t.get(ONE),valueOf(t.get(t.len()).checkdouble()-1)));
         }
      });
      env.get(print).invoke(env.get(pcall).invoke(varargsOf(env.get(f1),alo_alx_,_______1)));
      final LuaValue badpat = new ZeroArgFunction(env) {
         public LuaValue call() {
            env.get(print).invoke(env.get(string).get(gsub).invoke(varargsOf(alo,___,_2)));
            return NONE;
         }
      };
      env.get(print).call(env.get(pcall).call(badpat));
      LuaValue f,s,var;
      Varargs v;
      final Varargs v$1 = env.get(string).get(gmatch).invoke(varargsOf(w_200_h_,__w_____));
      f = v$1.arg1();
      s = v$1.arg(2);
      var = v$1.arg(3);
      while (true) {
         v = f.invoke(varargsOf(s,var));
         if ((var=v.arg1()).isnil()) break;
         final LuaValue k = var;
         final LuaValue v$2 = v.arg(2);
         env.get(print).call(k,v$2);
      }
      env.set(t,new OneArgFunction(env) {
         public LuaValue call(LuaValue str) {
            final LuaValue i = LuaValue.listOf(new LuaValue[]{ZERO,ONE,_2$1,_8,ONE.neg(),});
            LuaValue f$1,s$1,var$1;
            Varargs v$3;
            final Varargs v$4 = env.get(ipairs).invoke(i);
            f$1 = v$4.arg1();
            s$1 = v$4.arg(2);
            var$1 = v$4.arg(3);
            while (true) {
               v$3 = f$1.invoke(varargsOf(s$1,var$1));
               if ((var$1=v$3.arg1()).isnil()) break;
               final LuaValue ki = var$1;
               final LuaValue vi = v$3.arg(2);
               final Varargs t = env.get(pcall).invoke(varargsOf(env.get(string).get(sub$1),str,vi));
               final LuaValue s$2 = t.arg1();
               final LuaValue v$5 = t.arg(2);
               env.get(print).call(string_s.concat(str.concat(__.concat(env.get(tostring$1).call(vi).concat(__$1.concat(env.get(tostring$1).call(s$2).concat(__$2.concat(env.get(tostring$1).call(v$5).concat(_$3.buffer())))))))).value());
               final LuaValue j = LuaValue.listOf(new LuaValue[]{ZERO,ONE,_2$1,_4,_8,ONE.neg(),});
               LuaValue f$2,s$3,var$2;
               Varargs v$6;
               final Varargs v$7 = env.get(ipairs).invoke(j);
               f$2 = v$7.arg1();
               s$3 = v$7.arg(2);
               var$2 = v$7.arg(3);
               while (true) {
                  v$6 = f$2.invoke(varargsOf(s$3,var$2));
                  if ((var$2=v$6.arg1()).isnil()) break;
                  final LuaValue kj = var$2;
                  final LuaValue vj = v$6.arg(2);
                  final Varargs t$1 = env.get(pcall).invoke(varargsOf(new LuaValue[] {env.get(string).get(sub$1),str,vi,},vj));
                  final LuaValue s$4 = t$1.arg1();
                  final LuaValue v$8 = t$1.arg(2);
                  env.get(print).call(string_s.concat(str.concat(__.concat(env.get(tostring$1).call(vi).concat(_$4.concat(env.get(tostring$1).call(vj).concat(__$1.concat(env.get(tostring$1).call(s$4).concat(__$2.concat(env.get(tostring$1).call(v$8).concat(_$3.buffer())))))))))).value());
               }
            }
            return NONE;
         }
      });
      env.get(t).call(abcdefgh);
      env.get(t).call(abcdefg);
      env.get(t).call(abcd);
      env.get(t).call(abc);
      env.get(t).call(ab);
      env.get(t).call(a);
      env.get(t).call(_$1);
      env.get(print).invoke(env.get(string).get(len$1).invoke(Hello__w));
      env.get(print).call(Hello__w.len());
      env.get(print).invoke(env.get(string).get(len$1).invoke(___$1));
      env.get(print).call(___$1.len());
      env.get(print).invoke(env.get(string).get(len$1).invoke(____));
      env.get(print).call(____.len());
      env.get(print).call(My_JaCk_,env.get(string).get(len$1).call(My_JaCk_),My_JaCk_.len());
      env.get(print).invoke(env.get(string).get(format).invoke(varargsOf(new LuaValue[] {___0d___,ZERO,_5.neg(),},_9)));
      env.get(print).invoke(env.get(string).get(format).invoke(varargsOf(new LuaValue[] {___1d___,ZERO,_5.neg(),},_9)));
      env.get(print).invoke(env.get(string).get(format).invoke(varargsOf(new LuaValue[] {___2d___,ZERO,_5.neg(),},_9)));
      env.get(print).invoke(env.get(string).get(format).invoke(varargsOf(new LuaValue[] {____0d__,ZERO,_5.neg(),},_9)));
      env.get(print).invoke(env.get(string).get(format).invoke(varargsOf(new LuaValue[] {____1d__,ZERO,_5.neg(),},_9)));
      env.get(print).invoke(env.get(string).get(format).invoke(varargsOf(new LuaValue[] {____2d__,ZERO,_5.neg(),},_9)));
      env.get(print).invoke(env.get(string).get(format).invoke(varargsOf(new LuaValue[] {___3d___,_55,_55,},_55)));
      env.get(print).invoke(env.get(string).get(format).invoke(varargsOf(new LuaValue[] {___1d___$1,ONE,_12,},_12.neg())));
      env.get(print).invoke(env.get(string).get(format).invoke(varargsOf(new LuaValue[] {___2d___$1,ONE,_12,},_12.neg())));
      env.get(print).invoke(env.get(string).get(format).invoke(varargsOf(new LuaValue[] {___3d___$1,ONE,_12,},_12.neg())));
      env.get(print).invoke(env.get(string).get(format).invoke(varargsOf(new LuaValue[] {__8x____,_255,_255,},_255)));
      env.get(print).invoke(env.get(string).get(format).invoke(varargsOf(new LuaValue[] {__08x___,_255,_255,},_255)));
      env.get(print).invoke(env.get(string).get(format).invoke(varargsOf(simple_s,_simple_)));
      final LuaValue testformat = new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            final LuaValue message = $arg.arg1();
            final LuaValue fmt = $arg.arg(2);
            $arg = $arg.subargs(3);
            final LuaValue arg = NIL;
            final Varargs t$1 = env.get(pcall).invoke(varargsOf(env.get(string).get(format),fmt,$arg));
            final LuaValue s$1 = t$1.arg1();
            final LuaValue e = t$1.arg(2);
            if ( s$1.toboolean() ) {
               env.get(print).invoke(varargsOf(message,env.get(string).get(byte$1).invoke(varargsOf(e,ONE,e.len()))));
            } else {
               env.get(print).call(message,error$1,e);
            }
            return NONE;
         }
      };
      env.set(specials,_special);
      testformat.call(plain__,__$3);
      testformat.call(specials$1,____s___,env.get(specials));
      testformat.call(specials$2,____q___,env.get(specials));
      testformat.call(controls,____q___,________);
      testformat.call(extended,____q___,____$1);
      testformat.invoke(varargsOf(new LuaValue[] {embedded,_s__s__s,___$2,___$2,},___$2));
      env.get(print).invoke(varargsOf(this_is_,env.get(string).get(rep).invoke(varargsOf(really__,_30))));
      final LuaValue pc = new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            final LuaValue arg = NIL;
            LuaValue $b;
            final Varargs t$1 = env.get(pcall).invoke($arg);
            final LuaValue s$1 = t$1.arg1();
            final LuaValue e = t$1.arg(2);
            return (($b=(!($b=s$1).toboolean()?$b:e)).toboolean()?$b:false_.concat(env.get(type$1).call(e)));
         }
      };
      final LuaValue strtests = new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            final LuaValue name$1 = $arg.arg1();
            final LuaValue func = $arg.arg(2);
            $arg = $arg.subargs(3);
            final LuaValue arg = NIL;
            env.get(print).invoke(varargsOf(name$1,good,pc.invoke(varargsOf(func,$arg))));
            env.get(print).invoke(varargsOf(name$1,empty,pc.invoke(func)));
            env.get(print).invoke(varargsOf(name$1,table,pc.invoke(varargsOf(func,LuaValue.tableOf()))));
            env.get(print).invoke(varargsOf(name$1,nil,pc.invoke(varargsOf(func,NIL))));
            return NONE;
         }
      };
      strtests.call(lower,env.get(string).get(lower),My_JaCk_);
      strtests.call(upper,env.get(string).get(upper),My_JaCk_);
      strtests.call(reverse,env.get(string).get(reverse),My_JaCk_);
      strtests.invoke(varargsOf(new LuaValue[] {char$1,env.get(string).get(char$1),_92,_60,_61,},_93));
      strtests.invoke(varargsOf(dump,env.get(string).get(dump),env.get(loadstri).invoke(varargsOf(print__h,sample))));
      final LuaValue fmterr = new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            final LuaValue arg = NIL;
            final Varargs t$1 = env.get(pcall).invoke($arg);
            final LuaValue r = t$1.arg1();
            LuaValue s$1 = t$1.arg(2);
            if ( r.toboolean() ) {
               return s$1;
            } else {
               s$1 = env.get(string).get(gsub).call(s$1,stringli,_$1);
               return s$1;
            }
         }
      };
      env.get(print).invoke(fmterr.invoke(varargsOf(env.get(string).get(find),ab_c_0_,_$2)));
      env.get(print).invoke(fmterr.invoke(varargsOf(env.get(string).get(find),ab_c_0_,_$5)));
      env.get(print).invoke(env.get(pcall).invoke(varargsOf(env.get(string).get(find),ab_c_0_,_$6)));
      return NONE;
   }
   static final LuaValue print = valueOf("print");
   static final LuaValue string = valueOf("string");
   static final LuaValue find = valueOf("find");
   static final LuaValue _12345678 = valueOf("1234567890");
   static final LuaValue _ = valueOf(".");
   static final LuaValue alo_alx_ = valueOf("alo alx 123 b\u0000o b\u0000o");
   static final LuaValue _______1 = valueOf("(..*) %1");
   static final LuaValue aloALO = valueOf("aloALO");
   static final LuaValue _l_ = valueOf("%l*");
   static final LuaValue ___isto_ = valueOf(" \n isto \ufffd assim");
   static final LuaValue _S_S_ = valueOf("%S%S*");
   static final LuaValue _$1 = valueOf("");
   static final LuaValue ababaabb = valueOf("ababaabbaba");
   static final LuaValue abb = valueOf("abb");
   static final LuaValue _7 = valueOf(7);
   static final LuaValue match = valueOf("match");
   static final LuaValue aabaa = valueOf("aabaa");
   static final LuaValue a_ = valueOf("a*");
   static final LuaValue _3 = valueOf(3);
   static final LuaValue a_b = valueOf("a*b");
   static final LuaValue abbaaaba = valueOf("abbaaababaabaaabaa");
   static final LuaValue b_a__b = valueOf("b(a*)b");
   static final LuaValue b_a____b = valueOf("b(a*)()b");
   static final LuaValue _8 = valueOf(8);
   static final LuaValue _12 = valueOf(12);
   static final LuaValue byte$1 = valueOf("byte");
   static final LuaValue hi = valueOf("hi");
   static final LuaValue gsub = valueOf("gsub");
   static final LuaValue ABC = valueOf("ABC");
   static final LuaValue ___x__ = valueOf("@(%x+)");
   static final LuaValue _abcd = valueOf("|abcd");
   static final LuaValue _123 = valueOf("@123");
   static final LuaValue ABC_123 = valueOf("ABC@123");
   static final LuaValue ABC_123_ = valueOf("ABC@123@def");
   static final LuaValue ABC_123_$1 = valueOf("ABC@123@qrs@def@tuv");
   static final LuaValue _ab = valueOf("@ab");
   static final LuaValue tostring$1 = valueOf("tostring");
   static final LuaValue _1_234567 = valueOf(1.234567890123E12);
   static final LuaValue _1_234567$1 = valueOf(1.234567890124E12);
   static final LuaValue _1_234567$2 = valueOf(1.234567890125E12);
   static final LuaValue ____0_9_ = valueOf("%%([0-9])");
   static final LuaValue _$2 = valueOf("%");
   static final LuaValue _____ = valueOf("^(^?)");
   static final LuaValue _1__ = valueOf("%1()");
   static final LuaValue _____$1 = valueOf("($?)$");
   static final LuaValue ___1 = valueOf("()%1");
   static final LuaValue sub$1 = valueOf("sub");
   static final LuaValue f1 = valueOf("f1");
   static final LuaValue pcall = valueOf("pcall");
   static final LuaValue alo = valueOf("alo");
   static final LuaValue ___ = valueOf("(.)");
   static final LuaValue _2 = valueOf("%2");
   static final LuaValue gmatch = valueOf("gmatch");
   static final LuaValue w_200_h_ = valueOf("w=200&h=150");
   static final LuaValue __w_____ = valueOf("(%w+)=(%w+)");
   static final LuaValue _2$1 = valueOf(2);
   static final LuaValue ipairs = valueOf("ipairs");
   static final LuaValue string_s = valueOf("string.sub(\"");
   static final LuaValue __ = valueOf("\",");
   static final LuaValue __$1 = valueOf(")=");
   static final LuaValue __$2 = valueOf(",\"");
   static final LuaValue _$3 = valueOf("\"");
   static final LuaValue _4 = valueOf(4);
   static final LuaValue _$4 = valueOf(",");
   static final LuaValue t = valueOf("t");
   static final LuaValue abcdefgh = valueOf("abcdefghijklmn");
   static final LuaValue abcdefg = valueOf("abcdefg");
   static final LuaValue abcd = valueOf("abcd");
   static final LuaValue abc = valueOf("abc");
   static final LuaValue ab = valueOf("ab");
   static final LuaValue a = valueOf("a");
   static final LuaValue len$1 = valueOf("len");
   static final LuaValue Hello__w = valueOf("Hello, world");
   static final LuaValue ___$1 = valueOf("\u0000\u0000\u0000");
   static final LuaValue ____ = valueOf("\u0000\u0001\u0002\u0003");
   static final LuaValue My_JaCk_ = valueOf("My JaCk-O-lAnTeRn CaSe TeXt");
   static final LuaValue format = valueOf("format");
   static final LuaValue ___0d___ = valueOf("(%.0d) (%.0d) (%.0d)");
   static final LuaValue _5 = valueOf(5);
   static final LuaValue _9 = valueOf(9);
   static final LuaValue ___1d___ = valueOf("(%.1d) (%.1d) (%.1d)");
   static final LuaValue ___2d___ = valueOf("(%.2d) (%.2d) (%.2d)");
   static final LuaValue ____0d__ = valueOf("(%+.0d) (%+.0d) (%+.0d)");
   static final LuaValue ____1d__ = valueOf("(%+.1d) (%+.1d) (%+.1d)");
   static final LuaValue ____2d__ = valueOf("(%+.2d) (%+.2d) (%+.2d)");
   static final LuaValue ___3d___ = valueOf("(%+3d) (% 3d) (%+ 3d)");
   static final LuaValue _55 = valueOf(55);
   static final LuaValue ___1d___$1 = valueOf("(%-1d) (%-1d) (%-1d)");
   static final LuaValue ___2d___$1 = valueOf("(%-2d) (%-2d) (%-2d)");
   static final LuaValue ___3d___$1 = valueOf("(%-3d) (%-3d) (%-3d)");
   static final LuaValue __8x____ = valueOf("(%8x) (%8d) (%8o)");
   static final LuaValue _255 = valueOf(255);
   static final LuaValue __08x___ = valueOf("(%08x) (%08d) (%08o)");
   static final LuaValue simple_s = valueOf("simple%ssimple");
   static final LuaValue _simple_ = valueOf(" simple ");
   static final LuaValue error$1 = valueOf("error");
   static final LuaValue _special = valueOf("\"specials\": %% \u0000 \r \n");
   static final LuaValue specials = valueOf("specials");
   static final LuaValue plain__ = valueOf("plain %");
   static final LuaValue __$3 = valueOf("%%");
   static final LuaValue specials$1 = valueOf("specials (%s)");
   static final LuaValue ____s___ = valueOf("---%s---");
   static final LuaValue specials$2 = valueOf("specials (%q)");
   static final LuaValue ____q___ = valueOf("---%q---");
   static final LuaValue controls = valueOf("controls (%q)");
   static final LuaValue ________ = valueOf(" \u0007 \b \f \t \u000b \\ ");
   static final LuaValue extended = valueOf("extended (%q)");
   static final LuaValue ____$1 = valueOf(new byte[]{' ',-34,' ',-33,' ',-32,' '});
   static final LuaValue embedded = valueOf("embedded newlines");
   static final LuaValue _s__s__s = valueOf("%s\r%s\n%s");
   static final LuaValue ___$2 = valueOf("===");
   static final LuaValue this_is_ = valueOf("this is a %s long string");
   static final LuaValue rep = valueOf("rep");
   static final LuaValue really__ = valueOf("really, ");
   static final LuaValue _30 = valueOf(30);
   static final LuaValue false_ = valueOf("false-");
   static final LuaValue type$1 = valueOf("type");
   static final LuaValue good = valueOf("good");
   static final LuaValue empty = valueOf("empty");
   static final LuaValue table = valueOf("table");
   static final LuaValue nil = valueOf("nil");
   static final LuaValue lower = valueOf("lower");
   static final LuaValue upper = valueOf("upper");
   static final LuaValue reverse = valueOf("reverse");
   static final LuaValue char$1 = valueOf("char");
   static final LuaValue _92 = valueOf(92);
   static final LuaValue _60 = valueOf(60);
   static final LuaValue _61 = valueOf(61);
   static final LuaValue _93 = valueOf(93);
   static final LuaValue dump = valueOf("dump");
   static final LuaValue loadstri = valueOf("loadstring");
   static final LuaValue print__h = valueOf("print(\"hello, world\")");
   static final LuaValue sample = valueOf("sample");
   static final LuaValue stringli = valueOf("stringlib.lua:%d+:%s*");
   static final LuaValue ab_c_0_ = valueOf("ab%c)0(");
   static final LuaValue _$5 = valueOf("(");
   static final LuaValue _$6 = valueOf(")");
}