package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,55);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 55;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 56;BA.debugLine="Activity.LoadLayout(\"Layout\")";
Debug.ShouldStop(8388608);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Layout")),main.mostCurrent.activityBA);
 BA.debugLineNum = 57;BA.debugLine="num1 = 0";
Debug.ShouldStop(16777216);
main._num1 = BA.numberCast(int.class, 0);
 BA.debugLineNum = 58;BA.debugLine="num2 = 0";
Debug.ShouldStop(33554432);
main._num2 = BA.numberCast(int.class, 0);
 BA.debugLineNum = 59;BA.debugLine="flag = 1";
Debug.ShouldStop(67108864);
main._flag = BA.numberCast(int.class, 1);
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,67);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 67;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(4);
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,63);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 63;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 65;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button1_click() throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,71);
if (RapidSub.canDelegate("button1_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","button1_click");}
 BA.debugLineNum = 71;BA.debugLine="Sub Button1_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 72;BA.debugLine="Label2.Text = Label2.Text & \"1\"";
Debug.ShouldStop(128);
main.mostCurrent._label2.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(main.mostCurrent._label2.runMethod(true,"getText"),RemoteObject.createImmutable("1"))));
 BA.debugLineNum = 73;BA.debugLine="Label1.Text = Label1.Text & \"1\"";
Debug.ShouldStop(256);
main.mostCurrent._label1.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(main.mostCurrent._label1.runMethod(true,"getText"),RemoteObject.createImmutable("1"))));
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button10_click() throws Exception{
try {
		Debug.PushSubsStack("Button10_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,103);
if (RapidSub.canDelegate("button10_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","button10_click");}
 BA.debugLineNum = 103;BA.debugLine="Private Sub Button10_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 104;BA.debugLine="Label2.Text = Label2.Text & \"8\"";
Debug.ShouldStop(128);
main.mostCurrent._label2.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(main.mostCurrent._label2.runMethod(true,"getText"),RemoteObject.createImmutable("8"))));
 BA.debugLineNum = 105;BA.debugLine="Label1.Text = Label1.Text & \"8\"";
Debug.ShouldStop(256);
main.mostCurrent._label1.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(main.mostCurrent._label1.runMethod(true,"getText"),RemoteObject.createImmutable("8"))));
 BA.debugLineNum = 108;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button11_click() throws Exception{
try {
		Debug.PushSubsStack("Button11_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,98);
if (RapidSub.canDelegate("button11_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","button11_click");}
 BA.debugLineNum = 98;BA.debugLine="Private Sub Button11_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 99;BA.debugLine="Label1.Text = Label1.Text & \"9\"";
Debug.ShouldStop(4);
main.mostCurrent._label1.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(main.mostCurrent._label1.runMethod(true,"getText"),RemoteObject.createImmutable("9"))));
 BA.debugLineNum = 100;BA.debugLine="Label2.Text = Label2.Text & \"9\"";
Debug.ShouldStop(8);
main.mostCurrent._label2.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(main.mostCurrent._label2.runMethod(true,"getText"),RemoteObject.createImmutable("9"))));
 BA.debugLineNum = 101;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button12_click() throws Exception{
try {
		Debug.PushSubsStack("Button12_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,90);
if (RapidSub.canDelegate("button12_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","button12_click");}
 BA.debugLineNum = 90;BA.debugLine="Private Sub Button12_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 91;BA.debugLine="Label1.Text = Label1.Text & \"*\"";
Debug.ShouldStop(67108864);
main.mostCurrent._label1.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(main.mostCurrent._label1.runMethod(true,"getText"),RemoteObject.createImmutable("*"))));
 BA.debugLineNum = 92;BA.debugLine="Label2.Text = \"\"";
Debug.ShouldStop(134217728);
main.mostCurrent._label2.runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 95;BA.debugLine="op = 3";
Debug.ShouldStop(1073741824);
main._op = BA.numberCast(int.class, 3);
 BA.debugLineNum = 96;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button13_click() throws Exception{
try {
		Debug.PushSubsStack("Button13_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,83);
if (RapidSub.canDelegate("button13_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","button13_click");}
 BA.debugLineNum = 83;BA.debugLine="Private Sub Button13_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 84;BA.debugLine="Label2.Text = Label2.Text & \".\"";
Debug.ShouldStop(524288);
main.mostCurrent._label2.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(main.mostCurrent._label2.runMethod(true,"getText"),RemoteObject.createImmutable("."))));
 BA.debugLineNum = 85;BA.debugLine="Label1.Text = Label1.Text & \".\"";
Debug.ShouldStop(1048576);
main.mostCurrent._label1.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(main.mostCurrent._label1.runMethod(true,"getText"),RemoteObject.createImmutable("."))));
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button14_click() throws Exception{
try {
		Debug.PushSubsStack("Button14_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,77);
if (RapidSub.canDelegate("button14_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","button14_click");}
 BA.debugLineNum = 77;BA.debugLine="Private Sub Button14_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 78;BA.debugLine="Label1.Text = Label1.Text & \"0\"";
Debug.ShouldStop(8192);
main.mostCurrent._label1.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(main.mostCurrent._label1.runMethod(true,"getText"),RemoteObject.createImmutable("0"))));
 BA.debugLineNum = 79;BA.debugLine="Label2.Text = Label2.Text & \"0\"";
Debug.ShouldStop(16384);
main.mostCurrent._label2.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(main.mostCurrent._label2.runMethod(true,"getText"),RemoteObject.createImmutable("0"))));
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button16_click() throws Exception{
try {
		Debug.PushSubsStack("Button16_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,165);
if (RapidSub.canDelegate("button16_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","button16_click");}
 BA.debugLineNum = 165;BA.debugLine="Private Sub Button16_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 166;BA.debugLine="Label1.Text = Label1.Text & \"/\"";
Debug.ShouldStop(32);
main.mostCurrent._label1.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(main.mostCurrent._label1.runMethod(true,"getText"),RemoteObject.createImmutable("/"))));
 BA.debugLineNum = 167;BA.debugLine="Label2.Text = \"\"";
Debug.ShouldStop(64);
main.mostCurrent._label2.runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 168;BA.debugLine="op = 4";
Debug.ShouldStop(128);
main._op = BA.numberCast(int.class, 4);
 BA.debugLineNum = 169;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button2_click() throws Exception{
try {
		Debug.PushSubsStack("Button2_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,160);
if (RapidSub.canDelegate("button2_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","button2_click");}
 BA.debugLineNum = 160;BA.debugLine="Private Sub Button2_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 161;BA.debugLine="Label1.Text = Label1.Text & \"2\"";
Debug.ShouldStop(1);
main.mostCurrent._label1.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(main.mostCurrent._label1.runMethod(true,"getText"),RemoteObject.createImmutable("2"))));
 BA.debugLineNum = 162;BA.debugLine="Label2.Text = Label2.Text & \"2\"";
Debug.ShouldStop(2);
main.mostCurrent._label2.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(main.mostCurrent._label2.runMethod(true,"getText"),RemoteObject.createImmutable("2"))));
 BA.debugLineNum = 163;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button3_click() throws Exception{
try {
		Debug.PushSubsStack("Button3_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,153);
if (RapidSub.canDelegate("button3_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","button3_click");}
 BA.debugLineNum = 153;BA.debugLine="Private Sub Button3_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 154;BA.debugLine="Label2.Text = Label2.Text & \"3\"";
Debug.ShouldStop(33554432);
main.mostCurrent._label2.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(main.mostCurrent._label2.runMethod(true,"getText"),RemoteObject.createImmutable("3"))));
 BA.debugLineNum = 155;BA.debugLine="Label1.Text = Label1.Text & \"3\"";
Debug.ShouldStop(67108864);
main.mostCurrent._label1.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(main.mostCurrent._label1.runMethod(true,"getText"),RemoteObject.createImmutable("3"))));
 BA.debugLineNum = 158;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button4_click() throws Exception{
try {
		Debug.PushSubsStack("Button4_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,146);
if (RapidSub.canDelegate("button4_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","button4_click");}
 BA.debugLineNum = 146;BA.debugLine="Private Sub Button4_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 147;BA.debugLine="Label1.Text = Label1.Text & \"+\"";
Debug.ShouldStop(262144);
main.mostCurrent._label1.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(main.mostCurrent._label1.runMethod(true,"getText"),RemoteObject.createImmutable("+"))));
 BA.debugLineNum = 148;BA.debugLine="Label2.Text = \"\"";
Debug.ShouldStop(524288);
main.mostCurrent._label2.runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 150;BA.debugLine="op = 1";
Debug.ShouldStop(2097152);
main._op = BA.numberCast(int.class, 1);
 BA.debugLineNum = 151;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button5_click() throws Exception{
try {
		Debug.PushSubsStack("Button5_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,139);
if (RapidSub.canDelegate("button5_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","button5_click");}
 BA.debugLineNum = 139;BA.debugLine="Private Sub Button5_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 140;BA.debugLine="Label2.Text = Label2.Text & \"4\"";
Debug.ShouldStop(2048);
main.mostCurrent._label2.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(main.mostCurrent._label2.runMethod(true,"getText"),RemoteObject.createImmutable("4"))));
 BA.debugLineNum = 141;BA.debugLine="Label1.Text = Label1.Text & \"4\"";
Debug.ShouldStop(4096);
main.mostCurrent._label1.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(main.mostCurrent._label1.runMethod(true,"getText"),RemoteObject.createImmutable("4"))));
 BA.debugLineNum = 144;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button6_click() throws Exception{
try {
		Debug.PushSubsStack("Button6_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,132);
if (RapidSub.canDelegate("button6_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","button6_click");}
 BA.debugLineNum = 132;BA.debugLine="Private Sub Button6_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 133;BA.debugLine="Label2.Text = Label2.Text & \"5\"";
Debug.ShouldStop(16);
main.mostCurrent._label2.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(main.mostCurrent._label2.runMethod(true,"getText"),RemoteObject.createImmutable("5"))));
 BA.debugLineNum = 134;BA.debugLine="Label1.Text = Label1.Text & \"5\"";
Debug.ShouldStop(32);
main.mostCurrent._label1.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(main.mostCurrent._label1.runMethod(true,"getText"),RemoteObject.createImmutable("5"))));
 BA.debugLineNum = 137;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button7_click() throws Exception{
try {
		Debug.PushSubsStack("Button7_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,125);
if (RapidSub.canDelegate("button7_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","button7_click");}
 BA.debugLineNum = 125;BA.debugLine="Private Sub Button7_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 126;BA.debugLine="Label2.Text = Label2.Text & \"6\"";
Debug.ShouldStop(536870912);
main.mostCurrent._label2.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(main.mostCurrent._label2.runMethod(true,"getText"),RemoteObject.createImmutable("6"))));
 BA.debugLineNum = 127;BA.debugLine="Label1.Text = Label1.Text & \"6\"";
Debug.ShouldStop(1073741824);
main.mostCurrent._label1.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(main.mostCurrent._label1.runMethod(true,"getText"),RemoteObject.createImmutable("6"))));
 BA.debugLineNum = 130;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button8_click() throws Exception{
try {
		Debug.PushSubsStack("Button8_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,117);
if (RapidSub.canDelegate("button8_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","button8_click");}
 BA.debugLineNum = 117;BA.debugLine="Private Sub Button8_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 118;BA.debugLine="Label1.Text = Label1.Text & \"-\"";
Debug.ShouldStop(2097152);
main.mostCurrent._label1.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(main.mostCurrent._label1.runMethod(true,"getText"),RemoteObject.createImmutable("-"))));
 BA.debugLineNum = 119;BA.debugLine="Label2.Text = \"\"";
Debug.ShouldStop(4194304);
main.mostCurrent._label2.runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 121;BA.debugLine="op = 2";
Debug.ShouldStop(16777216);
main._op = BA.numberCast(int.class, 2);
 BA.debugLineNum = 123;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button9_click() throws Exception{
try {
		Debug.PushSubsStack("Button9_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,110);
if (RapidSub.canDelegate("button9_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","button9_click");}
 BA.debugLineNum = 110;BA.debugLine="Private Sub Button9_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 111;BA.debugLine="Label2.Text = Label2.Text & \"7\"";
Debug.ShouldStop(16384);
main.mostCurrent._label2.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(main.mostCurrent._label2.runMethod(true,"getText"),RemoteObject.createImmutable("7"))));
 BA.debugLineNum = 112;BA.debugLine="Label1.Text = Label1.Text & \"7\"";
Debug.ShouldStop(32768);
main.mostCurrent._label1.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(main.mostCurrent._label1.runMethod(true,"getText"),RemoteObject.createImmutable("7"))));
 BA.debugLineNum = 115;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clear_click() throws Exception{
try {
		Debug.PushSubsStack("clear_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,210);
if (RapidSub.canDelegate("clear_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","clear_click");}
 BA.debugLineNum = 210;BA.debugLine="Private Sub clear_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 211;BA.debugLine="Label1.Text = \"\"";
Debug.ShouldStop(262144);
main.mostCurrent._label1.runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 212;BA.debugLine="Label2.text	= \"\"";
Debug.ShouldStop(524288);
main.mostCurrent._label2.runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 213;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _del_click() throws Exception{
try {
		Debug.PushSubsStack("del_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,206);
if (RapidSub.canDelegate("del_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","del_click");}
 BA.debugLineNum = 206;BA.debugLine="Private Sub del_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 208;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _double_zero_click() throws Exception{
try {
		Debug.PushSubsStack("double_zero_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,202);
if (RapidSub.canDelegate("double_zero_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","double_zero_click");}
 BA.debugLineNum = 202;BA.debugLine="Private Sub double_zero_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 204;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _equals_click() throws Exception{
try {
		Debug.PushSubsStack("equals_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,175);
if (RapidSub.canDelegate("equals_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","equals_click");}
RemoteObject _str = RemoteObject.createImmutable("");
RemoteObject _part = null;
RemoteObject _operator = null;
RemoteObject _result = RemoteObject.createImmutable(0);
int _i = 0;
 BA.debugLineNum = 175;BA.debugLine="Private Sub equals_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 176;BA.debugLine="Try";
Debug.ShouldStop(32768);
try { BA.debugLineNum = 177;BA.debugLine="Dim str As String = Label1.Text";
Debug.ShouldStop(65536);
_str = main.mostCurrent._label1.runMethod(true,"getText");Debug.locals.put("str", _str);Debug.locals.put("str", _str);
 BA.debugLineNum = 178;BA.debugLine="Dim part() As String = Regex.Split(\"[+-/*]\", str)";
Debug.ShouldStop(131072);
_part = main.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("[+-/*]")),(Object)(_str));Debug.locals.put("part", _part);Debug.locals.put("part", _part);
 BA.debugLineNum = 179;BA.debugLine="Dim operator() As String = Regex.Split(\"\\d+\", str";
Debug.ShouldStop(262144);
_operator = main.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\d+")),(Object)(_str));Debug.locals.put("operator", _operator);Debug.locals.put("operator", _operator);
 BA.debugLineNum = 180;BA.debugLine="Dim result As Double = part(0)";
Debug.ShouldStop(524288);
_result = BA.numberCast(double.class, _part.getArrayElement(true,BA.numberCast(int.class, 0)));Debug.locals.put("result", _result);Debug.locals.put("result", _result);
 BA.debugLineNum = 181;BA.debugLine="For i = 0 To part.Length - 1";
Debug.ShouldStop(1048576);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {_part.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 182;BA.debugLine="Select operator(i)";
Debug.ShouldStop(2097152);
switch (BA.switchObjectToInt(_operator.getArrayElement(true,BA.numberCast(int.class, _i)),BA.ObjectToString("+"),BA.ObjectToString("-"),BA.ObjectToString("/"),BA.ObjectToString("*"))) {
case 0: {
 BA.debugLineNum = 184;BA.debugLine="result = result + part(i)";
Debug.ShouldStop(8388608);
_result = RemoteObject.solve(new RemoteObject[] {_result,BA.numberCast(double.class, _part.getArrayElement(true,BA.numberCast(int.class, _i)))}, "+",1, 0);Debug.locals.put("result", _result);
 break; }
case 1: {
 BA.debugLineNum = 186;BA.debugLine="result = result - part(i)";
Debug.ShouldStop(33554432);
_result = RemoteObject.solve(new RemoteObject[] {_result,BA.numberCast(double.class, _part.getArrayElement(true,BA.numberCast(int.class, _i)))}, "-",1, 0);Debug.locals.put("result", _result);
 break; }
case 2: {
 BA.debugLineNum = 188;BA.debugLine="result = result / part(i)";
Debug.ShouldStop(134217728);
_result = RemoteObject.solve(new RemoteObject[] {_result,BA.numberCast(double.class, _part.getArrayElement(true,BA.numberCast(int.class, _i)))}, "/",0, 0);Debug.locals.put("result", _result);
 break; }
case 3: {
 BA.debugLineNum = 190;BA.debugLine="result = result * part(i)";
Debug.ShouldStop(536870912);
_result = RemoteObject.solve(new RemoteObject[] {_result,BA.numberCast(double.class, _part.getArrayElement(true,BA.numberCast(int.class, _i)))}, "*",0, 0);Debug.locals.put("result", _result);
 break; }
}
;
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 193;BA.debugLine="Label2.Text = result";
Debug.ShouldStop(1);
main.mostCurrent._label2.runMethod(true,"setText",BA.ObjectToCharSequence(_result));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e20) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e20.toString()); BA.debugLineNum = 195;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4);
main.mostCurrent.__c.runVoidMethod ("LogImpl","81376276",BA.ObjectToString(main.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA)),0);
 BA.debugLineNum = 196;BA.debugLine="Label1.Text = \"Invalid Operation\"";
Debug.ShouldStop(8);
main.mostCurrent._label1.runMethod(true,"setText",BA.ObjectToCharSequence("Invalid Operation"));
 BA.debugLineNum = 197;BA.debugLine="Label2.Text = \"\"";
Debug.ShouldStop(16);
main.mostCurrent._label2.runMethod(true,"setText",BA.ObjectToCharSequence(""));
 };
 BA.debugLineNum = 200;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 23;BA.debugLine="Private Button1 As Button";
main.mostCurrent._button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private Button2 As Button";
main.mostCurrent._button2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private Button3 As Button";
main.mostCurrent._button3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private Button4 As Button";
main.mostCurrent._button4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private Button5 As Button";
main.mostCurrent._button5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private Button6 As Button";
main.mostCurrent._button6 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private Button7 As Button";
main.mostCurrent._button7 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private Button8 As Button";
main.mostCurrent._button8 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private Button9 As Button";
main.mostCurrent._button9 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private Button10 As Button";
main.mostCurrent._button10 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private Button11 As Button";
main.mostCurrent._button11 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private Button12 As Button";
main.mostCurrent._button12 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private Button13 As Button";
main.mostCurrent._button13 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private Button14 As Button";
main.mostCurrent._button14 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private Button16 As Button";
main.mostCurrent._button16 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Dim num1 As Int";
main._num1 = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 40;BA.debugLine="Dim num2 As Int";
main._num2 = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 41;BA.debugLine="Dim total As Int";
main._total = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 42;BA.debugLine="Dim flag As Int";
main._flag = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 43;BA.debugLine="Dim op As Int";
main._op = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 44;BA.debugLine="Dim carry As String";
main.mostCurrent._carry = RemoteObject.createImmutable("");
 //BA.debugLineNum = 46;BA.debugLine="Private clear As Button";
main.mostCurrent._clear = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 47;BA.debugLine="Private del As Button";
main.mostCurrent._del = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 48;BA.debugLine="Private double_zero As Button";
main.mostCurrent._double_zero = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 49;BA.debugLine="Private equals As Button";
main.mostCurrent._equals = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 50;BA.debugLine="Private Label1 As Label";
main.mostCurrent._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 51;BA.debugLine="Private Label2 As Label";
main.mostCurrent._label2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 52;BA.debugLine="Private percentage As Button";
main.mostCurrent._percentage = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _percentage_click() throws Exception{
try {
		Debug.PushSubsStack("percentage_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,171);
if (RapidSub.canDelegate("percentage_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","percentage_click");}
 BA.debugLineNum = 171;BA.debugLine="Private Sub percentage_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 173;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
starter.myClass = BA.getDeviceClass ("b4a.example.starter");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 18;BA.debugLine="Private xui As XUI";
main._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}