package idk;

import java.awt.List;
import java.util.*;

public class idk {
	public static void main(String[] args) {
		
		String[] moga = {"ossosssossysyyyhhhhhhyyyyhyyyyyhhyysysssssyysssssyyysyyyyysssyyyyyyyhhysyyssyyssssyhyyyhhyyyhdddddhy\r\n", 
				"osoooososssyyhyyyyyyyyhhyyyyhhyyhyyyysoosysssssosssssssyssssyhyyhyyyhhyyyyyssyyssyysyyyhhyyhdddhhysy\r\n", 
				"soooossyyssyyyhhhhhhyhhhyyyyhhyyhhhyyysyyssssssooosssyssysosyyhyyyyyyyyyyyyysssyyyysyyyhhhddddhddhys\r\n", 
				"oooooossssyyyyyhhhhhyhhhhhyhhhhhhhhyyyyyyyyssssoossysssyssossyyhhhhyyyysyyhhysssyyysyhdhhhddddddddhs\r\n", 
				"sooosssssyyyyyyyyyyyyyyyyyhhhhhhhhyyyyyyhhysssoooosyyyssyyyyyyhhhyhysyhyyyyysssssysyyhhhhhhhhddhhddy\r\n", 
				"ssossooosssyyyyyyyyyyyyyyyhhhhhhhhhyysyyyyyyssoosssssyysyhhhhhhhhhhyyyyyyssssossssssyyyhhhhhhhhdhhhy\r\n", 
				"ossyssooosyyyyhyyyyyyhyyyyyyyhhhhyyyyssyyyyyssssssssoosssyyyhhhhhhhhyyyyyhyyyssssyyyssyyhhhhhhhhhhhy\r\n", 
				"oossossossyyyyhhyyyyyyyyyyyyyyyyyyyyyyyhyyyyssyssoooooooosyyyyhhhhhhyyhyyyhyssoyyyyyyyyyyyhhhhhhhhhh\r\n", 
				"oosooossssyyyyyyyyyyyyyyyyyhhhhhyyyhhhyyysyysssssooooooooosyyhhhhhhhhhhhhhhyhyosssssyyyysyhhhhhhhhhh\r\n", 
				"sooooossssyyyhhyyyyyyyyyyyhhhhhhhhyhhhyyyyso+/:::/++ooooosyyyhyyhyyhhhhhhhhyyssysyyyyyyyyhhhhhhhhyhh\r\n", 
				"ooooossossyyyhhyyyyyyyyyyyyyyyhhhyyhhhyysoo++//::--:/syysooyhhhyhyhhhhhhhhhhyyhhyhhyyyyyhhhhhhhyhhhh\r\n", 
				"ooooossossyyyyyyyhyyyyhyyyyyyyhhyyhhhysssyyyyyyo+/:/+ydmmmhoshdhhhhhhhhhhdhhhhhhhyyyyhhhhhhhhhhhhhhh\r\n", 
				"sooosososysyyyyyhyyyyyyyyyyyyhhddddhyyyhhhhyyysyyhhhhhdmmNNmysyddddhhhhhhhhhyyyyyyyyyyhhhhhhyhhhhhhh\r\n", 
				"ssssssyssssyyyyyyyyyyyyyyyyhdmmmmmdddddddddddhyhdhddmmmmmmNNNdhyhhhdhhhhhhyyysyyyssyyhhhyyyyyhhhhhyy\r\n", 
				"sysyyyyyyssyyyyyyyyyyyysyhdmmNmmmNNNNmmmmmdmmdmmmNNNNNNNNmmmmNmmdyhdmddhhhyyssyyssssyyyyyyyyyyyyyyyy\r\n", 
				"yyyyyyyyyyyysssyyyyyyyyhdmmNNNNNNNNNmmmmddmdhhhhhdmNNNNNNNNmmNNNMNmmNmmddhhyyyssssssssyyyyyssssssyyy\r\n", 
				"yyyyyyyysssssoosyyyyyydmNNNNmNNNNNNNmmmmmmddhhddmNNNNNNMNNmmmmNNNNMNNNNNNmdhhysssosssyysssssssssyyyy\r\n", 
				"yyyyyysssssoooossyyyhdNNNNmNNNNNNNNNNNNmmmmmmmmNNNNNNmNmdyysssyhdhdmNNNMMMNmhhyssssssssssssossyyyyyy\r\n", 
				"yyyyyyssssoooo+oosyhmNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNmmdmhso+//+++ooooydmNMMMMNdysssossssssssssyyyyhhy\r\n", 
				"yyyyyyyysso+++++ooydNNNNNNNNNNNNNNNNNNNNNNNNNNNNNmmmmds+//::::::////++sdNNMMMMmhysooosssssyyyyyyhhhh\r\n", 
				"yyyyyyyyssso++++osdmNNNNNNNNNMMNNmNNNNNNNNNNNNNNmmmdy+/:::-------:::///oymNMMMMmhssssssssyyyyyyyhhhh\r\n", 
				"yyyyyyyyyyssooooshmNNNNNNNNMMNNmNNNNNNNNNNNNNNNmmdy+/::::::------::::://+smNNMMNmhsyyyyyyyyyhhyyyhhh\r\n", 
				"yyyyyyyyyysssoosydNNNNNNNNMMNNNNNNNNNNNNNNNNNmmhso/::::::-::-----:::::://+yNMMMMNmhyyyyyyyhhhhhhyyyy\r\n", 
				"yyyyyyyysyysooosdmNNNNNNNNNNNNNNNNNNNNNNNNmmdhso+//:::::::::::::::::::::/++dNMMMMmmhyyyyyyyyyhyyyyyy\r\n", 
				"syyyssyysssoooshmNNNNNNNNNNNNMMMNNNNNNNmdhyso+++/::::::::::::::::::///////+sNMNMMNmdyyyyyyyyyyyyhyyy\r\n", 
				"syyyssyysso+++ydNNNNNmNNNMMMMMMNNNNNNmhsso++/::::::---::-----:/+++++ooo++++omMNMMMNmhyyyyyyyyyyyyyyy\r\n", 
				"yyysssssooo++sdmNNmmmNNNMMMMMNNNNNNNmhyssoo++//::----::---:/oyhhyo/--:/ossoomMMMMMNNdyyyyyyyyyyyyyyy\r\n", 
				"syysssssso++ohmNNmmNNMMNMMMMMNMMNNNNdyo+++sydddhy+:::::--:/syhhhsso://+oshdmmhNMMMMNmyyyyyyyyyyyyyyy\r\n", 
				"sssssossoo+oydmmmmNNMMMMMMMMMMMMNNNmddhhysssyhyhhdhyoo++oyhdhhhdhhyhyyo/sddmNNMMMMMNmhyyyyyyyyyyyyyy\r\n", 
				"ssssssssoooydmmmmNNNMNMMMMMMMMMNmMmmdhhhdddyhsddddyymMmddNhosyyssyso+ss+oo+hdNMMMMMMNdyyyyyyyyyyyyyy\r\n", 
				"yssyysssossddmmmNNNMNNMMMMMMMMMNmNhdddhssyys++ooshyyNms+/yd+++++++/:::/:/++ymNMMMMMMNdyyyyyyyyyyyyyy\r\n", 
				"yssooooooshdmmmmmNNNNNMMMMMMMNNmydyosss++++///++osymNhy+//hs::::///:/::/://odMMMMMMNNdhsyyyyyyyyyyys\r\n", 
				"yyyssoo+oyddmmmmmNNNNNMMMMMMMNmdhydso+/////::::/+sdmhhy+:/+yy/::::::----/yy+hMMMMMMNNdhsyyyyyyyyyyys\r\n", 
				"yssoooooyddmmmddmNNmNMMMMMMMMNmdhsshy+/::----:/shmmhhhy+/:/++hy+oo/-/+/++///dMMMMMNNmddysyyyyyyyyyys\r\n", 
				"sssooosydmmmmmddmNmmNMMMNNMMMNmdhyysssyyoosssooshhyhhhy+/::/++++o/:--..-::/+dMMMMMNmmddyyyyyyyyyssss\r\n", 
				"ssssssyydmNmmdddNmdmNNMNNmNNMmmdhhyso+/::----:+yhyooyhs/---:////:+o+:::::/++dMMMMMNmmddyyyyyyyyyyyss\r\n", 
				"sssossydmNNNNdhmNmddmNNNNmNNMmddhhyyso+//::://+syyhdhhyo/:-:////::/+////++++hMMMMMNmmdhyyyyyyyyyyyyy\r\n", 
				"sssosshmNNNNNdhmNmdhdmmmmddNNNdhyyyhyso+//////+ooosyyyhyyo+//////::://///::/dMMMMMNmmdhyyyyyyyyyyyyy\r\n", 
				"sssssydNNMNNNdhdNmdyhddddddmNNdyso++ssso+/////++o++++++:::-://///::::::::--/mMMMMMMNNdhysysyyyyyyyyy\r\n", 
				"ysssyymNMMMMNmddNmdhhmhyhmddmNmhso/-:o+//////+ssyyyyssoo+++ossyys+/:::--:--sNMMMMMMNNmhysyyyyyyyyyss\r\n", 
				"syyyyhNNMMMMMNmdmmmdhdhyhmmmmNNmyo+:-+o/:-::/osyyyyysoo++++++++////:---::-/mMMMMMMMNmmdhhhyyyyyyysss\r\n", 
				"yyyyyhNMMMMMMMNmmmmmmddhhmNNNmNNmyo/:/o+:--:/+++++++/::::::---::///:--:::/dMMMMMMMMNmmmmdhyyyyyysssy\r\n", 
				"ssssyhNMMMMMMMNNmmmdmdhdddNNNNNNNmyo/++++:-/+++++++/:::::-----::////::/:+dNMMMMMMMMmdddddhhyyyyysssy\r\n", 
				"sssssymMMMMMMMMNNmNddmddmmmNNNNNNNmhooooo+/++++++///:::::------::///+//omMMMMMMMMMmhyyhddhhyyyyyyyyy\r\n", 
				"ossssyhNMMMMMMMMNNNNhdmmmmmmNNNNNNNNdyooossssoo++///::::-------:://++oyNMMMMMMMNmdhyhhddhyyyyyyyyyyy\r\n", 
				"ssssssydMMMMMMMMMMNNmddmmdmmmmNNNNNNNmhyssyhhhysso///:::::---:::/+syhmNNNNNNNNmddhdddddhyyssyyyyyyyy\r\n", 
				"ssyssssymMMMMMMMMMMMMNddddddmmmmNNNNNNmmdhhddddhhyso//::::::::/+shmNNNNNNNMMNmmdddddddhssyyyysyssyss\r\n", 
				"yyyyysssymMMMMMMMMMMMMNmddddddmmmmNNNNNmmmdddddmddhyys++//+++osdNNNMMMMNNNMMNmmmmmddhhyssyyysyysssss\r\n", 
				"syyyssssyymNMMMMMMMMMMMMNNmmmdddmmmmmNNNNmmmmdddddddddhyyssssshNNMMMMMMMNNNNNmmmddhyyyyysyyssyssssss\r\n", 
				"sssyyysyyyydNMMMMMMMMMMMMNNNNNmmddddmmmmmmmmdhhhhhhyyssooooo+ohmNMNNNNNNNNNNmmdhyysssyyyyyysssssssyy\r\n", 
				"sossssyyyyyyhmNNMMMMMMMMMMNNNNNNNNmmmdmmdhhyyyyyysso+++++////+sdmNNNNNNNmddhhyysssssssssssyyysssyyyy\r\n", 
				"sssyyysyyyyyyhdNMMMMMMMMMMMMNNNNNmmddddhyso+///+oo+//////::////+syhmMMMMNmhsssssssysssyyysyyyyyyyyyh\r\n", 
				"sssssssyyyyhdmNMMMMMMMMMMMMMMNNmmddhyso++/::---:///:::::::::::::/+oyNMMMMMNdhssssssssyyyyyyyyyyyysyy\r\n", 
				"yyyyyyyhyshNMMMMMMMMMMMMMMMMMMNmhyyso+/::::------::::-----::::::/+ooyNMMMMMMNdysssoosyhyyyyyyhyyysyy\r\n", 
				"hhhddhdd/.sMMMMMMMMMMMMMMMMMMMNdo+///:::::::-----:::::---:::::-:/++++yNMMMMMMMmdhysssyyyyyyyyyyyyyyy\r\n", 
				"mmNNNNMM:`+MMMMMMMMMMMMMMMMMMMNNNy//::-----:------::::::::::---:/o+//oNMMMMMMMMMNNmmdhhhhyyyyyyyyyyy\r\n", 
				"NNNNMMMMy`-NMMMMMMMMMMMMMMMMMMMMMMh+:-:---:::-----::::::::-----:/++//oNMMMMMMMMMMMMMMMNNNNmmdddhhysy\r\n", 
				"NNMMMMMMN+`yNMMMMMMMMMMMMMMMMMMNMMMmo::----::-----::----------::/++//sNMMMMMMMMMMMMMMMMMMMMMMNNmmhyh\r\n", 
				"MMMMMMMMMN+-dNMMMMMMMMMMMMMMMMNNMMMMNdo:---:::----::-----------://///yNMMMMMMMMMMMMMMMMMMMMMMMMMMNmh\r\n", 
				"MMMMMMMMMMMdoyMMMMMMMMMMMMMMMMMMMMMMMMNh+::::::----:::---------::///oNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n", 
				"MMMMMMMMMMMMNhMMMMMMMMMMMMMMMMMMMMMMMMMMNy/:::::---::::::------::///dMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n", 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMms/:::::-::::::::-----::/sNMMMMMMMMMMMMMMmdMMMMMMMMMMMMMMM\r\n", 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMdo:::::::--::::::----:/dMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n", 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMms:-:::------:::---:sNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n", 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMmo::-------::::::+mMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n", 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMd+:--::::::::/ohNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n", 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMd+//:::///oydNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM"};
		for (int i = moga.length-1;i>0;i--) System.out.print(moga[i]);
		
	}}
