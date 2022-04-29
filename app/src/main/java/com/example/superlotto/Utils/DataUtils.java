package com.example.superlotto.Utils;

import com.example.superlotto.Models.CashpotHelp;
import com.example.superlotto.Models.Chip;
import com.example.superlotto.Models.NumberSelection;
import com.example.superlotto.Models.PickModel;
import com.example.superlotto.Models.SelectedNumberDollar;
import com.example.superlotto.Models.SelectedNumberItem;
import com.example.superlotto.Models.SlotDataItem;
import com.example.superlotto.R;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class DataUtils {
    public static ArrayList<CashpotHelp> getCashpotHelp(){
        ArrayList<CashpotHelp> cashpotHelps = new ArrayList<>();
        cashpotHelps.add(new CashpotHelp("STEP 1:","Select the number(s) you want to buy (Up to 5 at a time)"));
        cashpotHelps.add(new CashpotHelp("STEP 2:", "Select the number of draws you want to buy the selected numbers for (Up to 12)"));
        cashpotHelps.add(new CashpotHelp("STEP 3:","Select the wager you want to place ($10-$500)"));
        cashpotHelps.add(new CashpotHelp("STEP 4:","Verify that you're over 18 years of age"));
        cashpotHelps.add(new CashpotHelp("STEP 5:","Select Play Now and confirm your Bet"));
        return cashpotHelps;
    }

    public static ArrayList<CashpotHelp> getPick4help(){
        ArrayList<CashpotHelp> pick4Helps = new ArrayList<>();
        pick4Helps.add(new CashpotHelp("STEP 1:","Each Panel contains the numbers 0 through 9, select four numbers you wish to play"));
        pick4Helps.add(new CashpotHelp("STEP 2:", "If you want the system to randomly select your numbers, Click Quick Pick button"));
        pick4Helps.add(new CashpotHelp("STEP 3:","Select your bet type. To play a “STRAIGHT” bet, choose bet type as Straight, to play a “MIX” bet, choose bet type as Mix."));
        pick4Helps.add(new CashpotHelp("STEP 4:","Select the number of draws you want to bet the selected numbers for (Up to 12)"));
        pick4Helps.add(new CashpotHelp("STEP 5:","Select the wager you want to place"));
        pick4Helps.add(new CashpotHelp("STEP 6:","Verify that you over 18 years of age"));
        pick4Helps.add(new CashpotHelp("STEP 7:","Click Play now and Confirm your bet"));

        return pick4Helps;
    }

    public static ArrayList<CashpotHelp> getPick2help(){
        ArrayList<CashpotHelp> pick4Helps = new ArrayList<>();
        pick4Helps.add(new CashpotHelp("STEP 1:","Each Panel contains the numbers 1 through 36, select two numbers you wish to play"));
        pick4Helps.add(new CashpotHelp("STEP 2:", "If you want the system to randomly select your numbers, Click Quick Pick button"));
        pick4Helps.add(new CashpotHelp("STEP 3:","Select the number of draws you want to bet the selected numbers for (Up to 12)"));
        pick4Helps.add(new CashpotHelp("STEP 4:","Select the wager you want to place"));
        pick4Helps.add(new CashpotHelp("STEP 5:","Verify that you over 18 years of age"));
        pick4Helps.add(new CashpotHelp("STEP 6:","Click Play now and Confirm your bet"));

        return pick4Helps;
    }

    public static ArrayList<CashpotHelp> getLottoHelp(){
        ArrayList<CashpotHelp> pick4Helps = new ArrayList<>();
        pick4Helps.add(new CashpotHelp("STEP 1:","The game contains number from 1 through 38, select six numbers you wish to play"));
        pick4Helps.add(new CashpotHelp("STEP 2:", "If you want the system to randomly select your numbers, click Quick Pick button"));
        pick4Helps.add(new CashpotHelp("STEP 3:","Select the number of draws you want to bet the selected numbers for (Up to 12)"));
        pick4Helps.add(new CashpotHelp("STEP 4:","You can place a $100 wager for every bet you place"));
        pick4Helps.add(new CashpotHelp("STEP 5:","Verify that you are over 18 years of age"));
        pick4Helps.add(new CashpotHelp("STEP 6:","Click Play now and Confirm your bet"));

        return pick4Helps;
    }

    public static ArrayList<CashpotHelp> getTopdrawHelp(){
        ArrayList<CashpotHelp> topdrawHelps = new ArrayList<>();
        topdrawHelps.add(new CashpotHelp("STEP 1:","The game contains number from 1 through 22, select five numbers you wish to play"));
        topdrawHelps.add(new CashpotHelp("STEP 2:", "If you want the system to randomly select your numbers, click Quick Pick button"));
        topdrawHelps.add(new CashpotHelp("STEP 3:","Select the number of draws you want to bet the selected numbers for (Up to 12)"));
        topdrawHelps.add(new CashpotHelp("STEP 4:","You can place a $50 wager for every bet you place"));
        topdrawHelps.add(new CashpotHelp("STEP 5:","Verify that you are over 18 years of age"));
        topdrawHelps.add(new CashpotHelp("STEP 6:","Click Play now and Confirm your bet"));

        return topdrawHelps;
    }

    public static ArrayList<CashpotHelp> getLucky5Help(){
        ArrayList<CashpotHelp> lucky5Helps = new ArrayList<>();
        lucky5Helps.add(new CashpotHelp("STEP 1:","The game contains number from 1 through 26, select five numbers you wish to play"));
        lucky5Helps.add(new CashpotHelp("STEP 2:", "If you want the system to randomly select your numbers, click Quick Pick button"));
        lucky5Helps.add(new CashpotHelp("STEP 3:","Select the number of draws you want to bet the selected numbers for (Up to 12)"));
        lucky5Helps.add(new CashpotHelp("STEP 4:","You can place a $30 wager for every bet you place"));
        lucky5Helps.add(new CashpotHelp("STEP 5:","Verify that you are over 18 years of age"));
        lucky5Helps.add(new CashpotHelp("STEP 6:","Click Play now and Confirm your bet"));

        return lucky5Helps;
    }

    public static ArrayList<CashpotHelp> getDollazHelp(){
        ArrayList<CashpotHelp> dollazHelps = new ArrayList<>();
        dollazHelps.add(new CashpotHelp("STEP 1:","The game contains number from 1 through 36"));
        dollazHelps.add(new CashpotHelp("STEP 2:","You can select spots from 3 to 10 which define the number of bets you can select"));
        dollazHelps.add(new CashpotHelp("STEP 3:", "If you want the system to randomly select your numbers, click Quick Pick button"));
        dollazHelps.add(new CashpotHelp("STEP 4:","Select the number of draws you want to bet the selected numbers for (Up to 12)"));
        dollazHelps.add(new CashpotHelp("STEP 5:","Select the wager from the dropdown that you wish to place the bet on the selected numbers"));
        dollazHelps.add(new CashpotHelp("STEP 6:","Verify that you are over 18 years of age"));
        dollazHelps.add(new CashpotHelp("STEP 7:","Click Play now and Confirm your bet"));

        return dollazHelps;
    }


    public static ArrayList<CashpotHelp> getSuperLottohelp(){
        ArrayList<CashpotHelp> superLottoHelps = new ArrayList<>();
        superLottoHelps.add(new CashpotHelp("STEP 1:", "The game contains number from 1 through 35 and super ball 1 to 10"));
        superLottoHelps.add(new CashpotHelp("STEP 2:", "Select five numbers and one super ball you wish to play"));
        superLottoHelps.add(new CashpotHelp("STEP 3:", "If you want the system to randomly select your numbers and super ball, click Quick Pick button"));
        superLottoHelps.add(new CashpotHelp("STEP 4:","You can place a $200 or $300 wager for every bet you place"));
        superLottoHelps.add(new CashpotHelp("STEP 5:","Verify that you are 18 years of age or older"));
        superLottoHelps.add(new CashpotHelp("STEP 6:","Click Play now and Confirm your bet"));

        return superLottoHelps;
    }


    public static ArrayList<CashpotHelp> getPick3help(){
        ArrayList<CashpotHelp> pick3Helps = new ArrayList<>();
        pick3Helps.add(new CashpotHelp("STEP 1:","Each Panel contains the numbers 0 through 9, select three numbers you wish to play"));
        pick3Helps.add(new CashpotHelp("STEP 2:", "If you want the system to randomly select your numbers, Click Quick Pick button"));
        pick3Helps.add(new CashpotHelp("STEP 3:","Select your bet type. To play a “STRAIGHT” bet, choose bet type as Straight, to play a “MIX” bet, choose bet type as Mix, to play a “BACKUP” bet, choose bet type as Backup."));
        pick3Helps.add(new CashpotHelp("STEP 4:","Select the number of draws you want to bet the selected numbers for (Up to 12)"));
        pick3Helps.add(new CashpotHelp("STEP 5:","Select the wager you want to place"));
        pick3Helps.add(new CashpotHelp("STEP 6:","Verify that you over 18 years of age"));
        pick3Helps.add(new CashpotHelp("STEP 7:","Click Play now and Confirm your bet"));

        return pick3Helps;
    }

    public static ArrayList<NumberSelection> getNumbersForCashpot(){
        ArrayList<NumberSelection> numberSelections = new ArrayList<>();
        numberSelections.add(new NumberSelection(R.drawable.duppy_new,"Duppy",true));
        numberSelections.add(new NumberSelection(R.drawable.small_fire_new,"Small Fire",true));
        numberSelections.add(new NumberSelection(R.drawable.dead_new,"Dead",true));
        numberSelections.add(new NumberSelection(R.drawable.egg_new,"Egg",true));
        numberSelections.add(new NumberSelection(R.drawable.thief_new,"Thief",true));
        numberSelections.add(new NumberSelection(R.drawable.strong_man_new,"Strong Man",true));
        numberSelections.add(new NumberSelection(R.drawable.married_woman_new,"Married Woman",true));
        numberSelections.add(new NumberSelection(R.drawable.belly_new,"Belly",true));
        numberSelections.add(new NumberSelection(R.drawable.cow_new,"Cow",true));
        numberSelections.add(new NumberSelection(R.drawable.small_house_new,"Small House",true));
        numberSelections.add(new NumberSelection(R.drawable.dog_new,"Dog",true));
        numberSelections.add(new NumberSelection(R.drawable.head_new,"Head",true));
        numberSelections.add(new NumberSelection(R.drawable.police_new,"Police",true));
        numberSelections.add(new NumberSelection(R.drawable.mouth_new,"Mouth",true));
        numberSelections.add(new NumberSelection(R.drawable.rat_new,"Rat",true));
        numberSelections.add(new NumberSelection(R.drawable.young_girl_new,"Young Girl",true));
        numberSelections.add(new NumberSelection(R.drawable.chinese_man_new,"Chinese Man",true));
        numberSelections.add(new NumberSelection(R.drawable.race_horse_new,"Race Horse",true));
        numberSelections.add(new NumberSelection(R.drawable.silver_money_new,"Silver Money",true));
        numberSelections.add(new NumberSelection(R.drawable.sick_person_new,"Sick Person",true));
        numberSelections.add(new NumberSelection(R.drawable.bad_girl_new,"Bad Girl",true));
        numberSelections.add(new NumberSelection(R.drawable.white_woman_new,"White Woman",true));
        numberSelections.add(new NumberSelection(R.drawable.black_man_new,"Black Man",true));
        numberSelections.add(new NumberSelection(R.drawable.fresh_water_new,"Fresh Water",true));
        numberSelections.add(new NumberSelection(R.drawable.john_crow_new,"John Crow",true));
        numberSelections.add(new NumberSelection(R.drawable.white_man_new,"White Man",true));
        numberSelections.add(new NumberSelection(R.drawable.big_fire_new,"Big Fire",true));
        numberSelections.add(new NumberSelection(R.drawable.fowl_new,"Fowl",true));
        numberSelections.add(new NumberSelection(R.drawable.parson_new,"Parson",true));
        numberSelections.add(new NumberSelection(R.drawable.fish_new,"Fish",true));
        numberSelections.add(new NumberSelection(R.drawable.lizard_new,"Lizard",true));
        numberSelections.add(new NumberSelection(R.drawable.gold_new,"Gold",true));
        numberSelections.add(new NumberSelection(R.drawable.big_house_new,"Big House",true));
        numberSelections.add(new NumberSelection(R.drawable.baby_new,"Baby",true));
        numberSelections.add(new NumberSelection(R.drawable.goat_new,"Goat",true));
        numberSelections.add(new NumberSelection(R.drawable.old_lady_new,"Old Lady",true));
        return numberSelections;
    }

    public static ArrayList<SelectedNumberItem> getDefaultSelectedNumberItems(){
        ArrayList<SelectedNumberItem> selectedNumberItems = new ArrayList<>();
        selectedNumberItems.add(new SelectedNumberItem(R.drawable.selected__item_placeholder,"",false,0));
        selectedNumberItems.add(new SelectedNumberItem(R.drawable.selected__item_placeholder,"",false,0));
        selectedNumberItems.add(new SelectedNumberItem(R.drawable.selected__item_placeholder,"",false,0));
        selectedNumberItems.add(new SelectedNumberItem(R.drawable.selected__item_placeholder,"",false,0));
        selectedNumberItems.add(new SelectedNumberItem(R.drawable.selected__item_placeholder,"",false,0));
        return selectedNumberItems;
    }

    public static ArrayList<SelectedNumberDollar> getDefaultSelectedNumberItemsDollaz(){
        ArrayList<SelectedNumberDollar> selectedNumberItems = new ArrayList<>();
        selectedNumberItems.add(new SelectedNumberDollar());
        selectedNumberItems.add(new SelectedNumberDollar());
        selectedNumberItems.add(new SelectedNumberDollar());
        selectedNumberItems.add(new SelectedNumberDollar());
        selectedNumberItems.add(new SelectedNumberDollar());
        selectedNumberItems.add(new SelectedNumberDollar());
        selectedNumberItems.add(new SelectedNumberDollar());
        selectedNumberItems.add(new SelectedNumberDollar());
        selectedNumberItems.add(new SelectedNumberDollar());
        selectedNumberItems.add(new SelectedNumberDollar());

        return selectedNumberItems;
    }

    public static ArrayList<SlotDataItem> getSlotDataItem(){
        ArrayList<SlotDataItem> slotDataItems = new ArrayList<>();
        slotDataItems.add(new SlotDataItem("EARLYBIRD","9:30:AM",0));
        slotDataItems.add(new SlotDataItem("MORNING","11:30:AM",0));
        slotDataItems.add(new SlotDataItem("MIDDAY","2:00:PM",0));
        slotDataItems.add(new SlotDataItem("MIDAFTERNOON","4:00:PM",0));
        slotDataItems.add(new SlotDataItem("DRIVETIME","6:00:PM",0));
        slotDataItems.add(new SlotDataItem("EVENING","9:25:PM",0));
        slotDataItems.add(new SlotDataItem("EARLYBIRD","9:30:AM",1));
        slotDataItems.add(new SlotDataItem("MORNING","11:30:AM",1));
        slotDataItems.add(new SlotDataItem("MIDDAY","2:00:PM",1));
        slotDataItems.add(new SlotDataItem("MIDAFTERNOON","4:00:PM",1));
        slotDataItems.add(new SlotDataItem("DRIVETIME","6:00:PM",1));
        slotDataItems.add(new SlotDataItem("EVENING","9:25:PM",1));
        slotDataItems.add(new SlotDataItem("EARLYBIRD","9:30:AM",2));
        slotDataItems.add(new SlotDataItem("MORNING","11:30:AM",2));
        slotDataItems.add(new SlotDataItem("MIDDAY","2:00:PM",2));
        slotDataItems.add(new SlotDataItem("MIDAFTERNOON","4:00:PM",2));
        slotDataItems.add(new SlotDataItem("DRIVETIME","6:00:PM",2));
        slotDataItems.add(new SlotDataItem("EVENING","9:25:PM",2));


        return slotDataItems;
    }

    public static int getCurrentSlot(){
        long currentTime = System.currentTimeMillis();
        Date date = new Date(currentTime);
        DateFormat formatter = new SimpleDateFormat("HH:mm:aa", Locale.ENGLISH);
        String dateFormatted = formatter.format(date);
        ArrayList<SlotDataItem> slotDataItems = getSlotDataItem();
        for (int i=0;i<slotDataItems.size();i++){
            if (dateFormatted.toUpperCase().compareTo(slotDataItems.get(i).getSlotTime())<0){
                return i;
            }
        }
        return 0;
    }

    public static ArrayList<Chip> chips(){
        ArrayList<Chip> chips = new ArrayList<>();
        chips.add(new Chip(R.drawable.green_chip,10,false));
        chips.add(new Chip(R.drawable.green_chip,20,false));
        chips.add(new Chip(R.drawable.green_chip,30,false));
        chips.add(new Chip(R.drawable.green_chip,40,false));
        chips.add(new Chip(R.drawable.green_chip,50,false));
        chips.add(new Chip(R.drawable.green_chip,100,false));
        chips.add(new Chip(R.drawable.green_chip,200,false));
        chips.add(new Chip(R.drawable.green_chip,500,false));
        return chips;
    }

    public static Map<String,Integer> setupBetTypeDollaz(){
        Map<String,Integer> betType = new HashMap<>();
        betType.put("3-SPOT",3);
        betType.put("4-SPOT",4);
        betType.put("5-SPOT",5);
        betType.put("6-SPOT",6);
        betType.put("7-SPOT",7);
        betType.put("8-SPOT",8);
        betType.put("9-SPOT",9);
        betType.put("10-SPOT",10);
        return betType;
    };

    public static ArrayList<String> betTypesDollaz(){
        ArrayList<String> betTypes = new ArrayList<>();
        betTypes.add("3-SPOT");
        betTypes.add("4-SPOT");
        betTypes.add("5-SPOT");
        betTypes.add("6-SPOT");
        betTypes.add("7-SPOT");
        betTypes.add("8-SPOT");
        betTypes.add("9-SPOT");
        betTypes.add("10-SPOT");
        return betTypes;
    }

    public static Map<Integer,Integer> setupTableValue() {
        Map<Integer,Integer> tableValue = new HashMap<>();
        tableValue.put(0,0);
        tableValue.put(1,0);
        tableValue.put(2,0);
        tableValue.put(3,0);
        tableValue.put(4,0);
        tableValue.put(5,0);
        tableValue.put(6,0);
        tableValue.put(7,0);
        tableValue.put(8,0);
        tableValue.put(9,0);
        tableValue.put(10,0);
        tableValue.put(11,0);
        tableValue.put(12,0);
        tableValue.put(13,0);
        tableValue.put(14,0);
        tableValue.put(15,0);
        tableValue.put(16,0);
        tableValue.put(17,0);
        tableValue.put(18,0);
        tableValue.put(19,0);
        tableValue.put(20,0);
        tableValue.put(21,0);
        tableValue.put(22,0);
        tableValue.put(23,0);
        tableValue.put(24,0);
        tableValue.put(25,0);
        tableValue.put(26,0);
        tableValue.put(27,0);
        tableValue.put(28,0);
        tableValue.put(29,0);
        tableValue.put(30,0);
        tableValue.put(31,0);
        tableValue.put(32,0);
        tableValue.put(33,0);
        tableValue.put(34,0);
        tableValue.put(35,0);
        tableValue.put(36,0);
        tableValue.put(37,0);
        tableValue.put(38,0);
        tableValue.put(39,0);
        tableValue.put(40,0);
        tableValue.put(41,0);
        tableValue.put(42,0);
        tableValue.put(43,0);
        tableValue.put(44,0);
        tableValue.put(45,0);
        tableValue.put(46,0);
        tableValue.put(47,0);
        tableValue.put(48,0);
        tableValue.put(49,0);
        tableValue.put(50,0);
        tableValue.put(51,0);
        tableValue.put(52,0);
        tableValue.put(53,0);
        tableValue.put(54,0);
        tableValue.put(55,0);
        tableValue.put(56,0);
        tableValue.put(57,0);
        tableValue.put(58,0);
        tableValue.put(59,0);
        tableValue.put(60,0);
        tableValue.put(61,0);
        return tableValue;
    }

    public static int getReverseMappingImageRed(int key){
        return reverseImageMapRed.get(key);
    }
    public static int getReverseMappingImageBlue(int key){
        return reverseImageMapBlue.get(key);
    }
    public static int getReverseMappingImageGrey(int key){
        return reverseImageMapGrey.get(key);
    }
    public static int getReverseMappingImageGreen(int key){
        return reverseImageMapGreen.get(key);
    }

    static HashMap<Integer, Integer> reverseImageMapRed = new HashMap<Integer, Integer>(){{
        put(0,R.drawable.doublezero);
        put(1,R.drawable.zero);
        put(2,R.drawable.one);
        put(3,R.drawable.two);
        put(4,R.drawable.three);
        put(5,R.drawable.four);
        put(6,R.drawable.five);
        put(7,R.drawable.six);
        put(8,R.drawable.seven);
        put(9,R.drawable.eight);
        put(10,R.drawable.nine);
        put(11,R.drawable.ten);
        put(12,R.drawable.eleven);
        put(13,R.drawable.twelve);
        put(14,R.drawable.thirteen);
        put(15,R.drawable.fourteen);
        put(16,R.drawable.fifteen);
        put(17,R.drawable.sixteen);
        put(18,R.drawable.seventeen);
        put(19,R.drawable.eighteen);
        put(20,R.drawable.nineteen);
        put(21,R.drawable.twenty);
        put(22,R.drawable.twentyone);
        put(23,R.drawable.twentytwo);
        put(24,R.drawable.twentythree);
        put(25,R.drawable.twentyfour);
        put(26,R.drawable.twentyfive);
        put(27,R.drawable.twentysix);
        put(28,R.drawable.twentyseven);
        put(29,R.drawable.twentyeight);
        put(30,R.drawable.twentynine);
        put(31,R.drawable.thirty);
        put(32,R.drawable.thirtyone);
        put(33,R.drawable.thirtytwo);
        put(34,R.drawable.thirtythree);
        put(35,R.drawable.thirtyfour);
        put(36,R.drawable.thirtyfive);
        put(37,R.drawable.thirtysix);
        put(38,R.drawable.redrowone);
        put(39,R.drawable.redrowtwo);
        put(40,R.drawable.redrowthree);
        put(41,R.drawable.redrowfour);
        put(42,R.drawable.redrowfive);
        put(43,R.drawable.redrowsix);
        put(44,R.drawable.redrowseven);
        put(45,R.drawable.redroweight);
        put(46,R.drawable.redrownine);
        put(47,R.drawable.redrowten);
        put(48,R.drawable.redroweleven);
        put(49,R.drawable.redrowtwelve);
        put(50,R.drawable.redcolone);
        put(51,R.drawable.redcoltwo);
        put(52,R.drawable.redcolthree);
        put(53,R.drawable.redfirstdozen);
        put(54,R.drawable.redseconddozen);
        put(55,R.drawable.redthirddozen);
        put(56,R.drawable.redodd);
        put(57,R.drawable.redeven);
        put(58,R.drawable.diamondred);
        put(59,R.drawable.diamondblack);
        put(60,R.drawable.redlow);
        put(61,R.drawable.redhigh);
    }};

    static HashMap<Integer, Integer> reverseImageMapGreen = new HashMap<Integer, Integer>(){{
        put(0,R.drawable.doublezero);
        put(1,R.drawable.zero);
        put(2,R.drawable.one);
        put(3,R.drawable.two);
        put(4,R.drawable.three);
        put(5,R.drawable.four);
        put(6,R.drawable.five);
        put(7,R.drawable.six);
        put(8,R.drawable.seven);
        put(9,R.drawable.eight);
        put(10,R.drawable.nine);
        put(11,R.drawable.ten);
        put(12,R.drawable.eleven);
        put(13,R.drawable.twelve);
        put(14,R.drawable.thirteen);
        put(15,R.drawable.fourteen);
        put(16,R.drawable.fifteen);
        put(17,R.drawable.sixteen);
        put(18,R.drawable.seventeen);
        put(19,R.drawable.eighteen);
        put(20,R.drawable.nineteen);
        put(21,R.drawable.twenty);
        put(22,R.drawable.twentyone);
        put(23,R.drawable.twentytwo);
        put(24,R.drawable.twentythree);
        put(25,R.drawable.twentyfour);
        put(26,R.drawable.twentyfive);
        put(27,R.drawable.twentysix);
        put(28,R.drawable.twentyseven);
        put(29,R.drawable.twentyeight);
        put(30,R.drawable.twentynine);
        put(31,R.drawable.thirty);
        put(32,R.drawable.thirtyone);
        put(33,R.drawable.thirtytwo);
        put(34,R.drawable.thirtythree);
        put(35,R.drawable.thirtyfour);
        put(36,R.drawable.thirtyfive);
        put(37,R.drawable.thirtysix);
        put(38,R.drawable.greenrowone);
        put(39,R.drawable.greenrowtwo);
        put(40,R.drawable.greenrowthree);
        put(41,R.drawable.greenrowfour);
        put(42,R.drawable.greenrowfive);
        put(43,R.drawable.greenrowsix);
        put(44,R.drawable.greenrowseven);
        put(45,R.drawable.greenroweight);
        put(46,R.drawable.greenrownine);
        put(47,R.drawable.greenrowten);
        put(48,R.drawable.greenroweleven);
        put(49,R.drawable.greenrowtwelve);
        put(50,R.drawable.greencolone);
        put(51,R.drawable.greencoltwo);
        put(52,R.drawable.greencolthree);
        put(53,R.drawable.greenfirstdozen);
        put(54,R.drawable.greenseconddozen);
        put(55,R.drawable.greenthirddozen);
        put(56,R.drawable.greenodd);
        put(57,R.drawable.greeneven);
        put(58,R.drawable.diamondred);
        put(59,R.drawable.diamondblack);
        put(60,R.drawable.greenlow);
        put(61,R.drawable.greenhigh);
    }};

    static HashMap<Integer, Integer> reverseImageMapGrey = new HashMap<Integer, Integer>(){{
        put(0,R.drawable.doublezero);
        put(1,R.drawable.zero);
        put(2,R.drawable.one);
        put(3,R.drawable.two);
        put(4,R.drawable.three);
        put(5,R.drawable.four);
        put(6,R.drawable.five);
        put(7,R.drawable.six);
        put(8,R.drawable.seven);
        put(9,R.drawable.eight);
        put(10,R.drawable.nine);
        put(11,R.drawable.ten);
        put(12,R.drawable.eleven);
        put(13,R.drawable.twelve);
        put(14,R.drawable.thirteen);
        put(15,R.drawable.fourteen);
        put(16,R.drawable.fifteen);
        put(17,R.drawable.sixteen);
        put(18,R.drawable.seventeen);
        put(19,R.drawable.eighteen);
        put(20,R.drawable.nineteen);
        put(21,R.drawable.twenty);
        put(22,R.drawable.twentyone);
        put(23,R.drawable.twentytwo);
        put(24,R.drawable.twentythree);
        put(25,R.drawable.twentyfour);
        put(26,R.drawable.twentyfive);
        put(27,R.drawable.twentysix);
        put(28,R.drawable.twentyseven);
        put(29,R.drawable.twentyeight);
        put(30,R.drawable.twentynine);
        put(31,R.drawable.thirty);
        put(32,R.drawable.thirtyone);
        put(33,R.drawable.thirtytwo);
        put(34,R.drawable.thirtythree);
        put(35,R.drawable.thirtyfour);
        put(36,R.drawable.thirtyfive);
        put(37,R.drawable.thirtysix);
        put(38,R.drawable.greyrowone);
        put(39,R.drawable.greyrowtwo);
        put(40,R.drawable.greyrowthree);
        put(41,R.drawable.greyrowfour);
        put(42,R.drawable.greyrowfive);
        put(43,R.drawable.greyrowsix);
        put(44,R.drawable.greyrowseven);
        put(45,R.drawable.greyroweight);
        put(46,R.drawable.greyrownine);
        put(47,R.drawable.greyrowten);
        put(48,R.drawable.greyroweleven);
        put(49,R.drawable.greyrowtwelve);
        put(50,R.drawable.greycolone);
        put(51,R.drawable.greycoltwo);
        put(52,R.drawable.greycolthree);
        put(53,R.drawable.greyfirstdozen);
        put(54,R.drawable.greyseconddozen);
        put(55,R.drawable.greythirddozen);
        put(56,R.drawable.greyodd);
        put(57,R.drawable.greyeven);
        put(58,R.drawable.diamondred);
        put(59,R.drawable.diamondblack);
        put(60,R.drawable.greylow);
        put(61,R.drawable.greyhigh);
    }};

    static HashMap<Integer, Integer> reverseImageMapBlue = new HashMap<Integer, Integer>(){{
        put(0,R.drawable.doublezero);
        put(1,R.drawable.zero);
        put(2,R.drawable.one);
        put(3,R.drawable.two);
        put(4,R.drawable.three);
        put(5,R.drawable.four);
        put(6,R.drawable.five);
        put(7,R.drawable.six);
        put(8,R.drawable.seven);
        put(9,R.drawable.eight);
        put(10,R.drawable.nine);
        put(11,R.drawable.ten);
        put(12,R.drawable.eleven);
        put(13,R.drawable.twelve);
        put(14,R.drawable.thirteen);
        put(15,R.drawable.fourteen);
        put(16,R.drawable.fifteen);
        put(17,R.drawable.sixteen);
        put(18,R.drawable.seventeen);
        put(19,R.drawable.eighteen);
        put(20,R.drawable.nineteen);
        put(21,R.drawable.twenty);
        put(22,R.drawable.twentyone);
        put(23,R.drawable.twentytwo);
        put(24,R.drawable.twentythree);
        put(25,R.drawable.twentyfour);
        put(26,R.drawable.twentyfive);
        put(27,R.drawable.twentysix);
        put(28,R.drawable.twentyseven);
        put(29,R.drawable.twentyeight);
        put(30,R.drawable.twentynine);
        put(31,R.drawable.thirty);
        put(32,R.drawable.thirtyone);
        put(33,R.drawable.thirtytwo);
        put(34,R.drawable.thirtythree);
        put(35,R.drawable.thirtyfour);
        put(36,R.drawable.thirtyfive);
        put(37,R.drawable.thirtysix);
        put(38,R.drawable.bluerowone);
        put(39,R.drawable.bluerowtwo);
        put(40,R.drawable.bluerowthree);
        put(41,R.drawable.bluerowfour);
        put(42,R.drawable.bluerowfive);
        put(43,R.drawable.bluerowsix);
        put(44,R.drawable.bluerowseven);
        put(45,R.drawable.blueroweight);
        put(46,R.drawable.bluerownine);
        put(47,R.drawable.bluerowten);
        put(48,R.drawable.blueroweleven);
        put(49,R.drawable.bluerowtwelve);
        put(50,R.drawable.bluecolone);
        put(51,R.drawable.bluecoltwo);
        put(52,R.drawable.bluecolthree);
        put(53,R.drawable.bluefirstdozen);
        put(54,R.drawable.blueseconddozen);
        put(55,R.drawable.bluethirddozen);
        put(56,R.drawable.blueodd);
        put(57,R.drawable.blueeven);
        put(58,R.drawable.diamondred);
        put(59,R.drawable.diamondblack);
        put(60,R.drawable.bluelow);
        put(61,R.drawable.bluehigh);
    }};

    static HashMap<Integer, String> reverseNameMap = new HashMap<Integer, String>(){{
        put(0,"Number 00");
        put(1,"Number 0");
        put(2,"Number 1");
        put(3,"Number 2");
        put(4,"Number 3");
        put(5,"Number 4");
        put(6,"Number 5");
        put(7,"Number 6");
        put(8,"Number 7");
        put(9,"Number 8");
        put(10,"Number 9");
        put(11,"Number 10");
        put(12,"Number 11");
        put(13,"Number 12");
        put(14,"Number 13");
        put(15,"Number 14");
        put(16,"Number 15");
        put(17,"Number 16");
        put(18,"Number 17");
        put(19,"Number 18");
        put(20,"Number 19");
        put(21,"Number 20");
        put(22,"Number 21");
        put(23,"Number 22");
        put(24,"Number 23");
        put(25,"Number 24");
        put(26,"Number 25");
        put(27,"Number 26");
        put(28,"Number 27");
        put(29,"Number 28");
        put(30,"Number 29");
        put(31,"Number 30");
        put(32,"Number 31");
        put(33,"Number 32");
        put(34,"Number 33");
        put(35,"Number 34");
        put(36,"Number 35");
        put(37,"Number 36");
        put(38,"Row 1");
        put(39,"Row 2");
        put(40,"Row 3");
        put(41,"Row 4");
        put(42,"Row 5");
        put(43,"Row 6");
        put(44,"Row 7");
        put(45,"Row 8");
        put(46,"Row 9");
        put(47,"Row 10");
        put(48,"Row 11");
        put(49,"Row 12");
        put(50,"Col 1");
        put(51,"Col 2");
        put(52,"Col 3");
        put(53,"1st Dozen");
        put(54,"2nd Dozen");
        put(55,"3rd Dozen");
        put(56,"Odd");
        put(57,"Even");
        put(58,"Red");
        put(59,"Black");
        put(60,"Low 1-18");
        put(61,"High 19-36");
    }};

    public static String getReverseMappingForName(int key){
        return reverseNameMap.get(key);
    }

    public static ArrayList<PickModel> pickModels = new ArrayList<PickModel>(){{
        ArrayList<PickModel> pickNumbers = new ArrayList<>();
        //add(new PickModel(-1,R.drawable.pick4));
        add(new PickModel(0,R.drawable.pick_zero));
        add(new PickModel(1,R.drawable.pick_one));
        add(new PickModel(2,R.drawable.pick_two));
        add(new PickModel(3,R.drawable.pick_three));
        add(new PickModel(4,R.drawable.pick_four));
        add(new PickModel(5,R.drawable.pick_five));
        add(new PickModel(6,R.drawable.pick_six));
        add(new PickModel(7,R.drawable.pick_seven));
        add(new PickModel(8,R.drawable.pick_eight));
        add(new PickModel(9,R.drawable.pick_nine));
    }};


    public static ArrayList<PickModel> pick3Models = new ArrayList<PickModel>(){{
        ArrayList<PickModel> pickNumbers = new ArrayList<>();
//        add(new PickModel(-1,R.drawable.pick3));
        add(new PickModel(0,R.drawable.pick_zero));
        add(new PickModel(1,R.drawable.pick_one));
        add(new PickModel(2,R.drawable.pick_two));
        add(new PickModel(3,R.drawable.pick_three));
        add(new PickModel(4,R.drawable.pick_four));
        add(new PickModel(5,R.drawable.pick_five));
        add(new PickModel(6,R.drawable.pick_six));
        add(new PickModel(7,R.drawable.pick_seven));
        add(new PickModel(8,R.drawable.pick_eight));
        add(new PickModel(9,R.drawable.pick_nine));
    }};


    public static ArrayList<PickModel>  pick2Models = new ArrayList<PickModel>(){{
        ArrayList<PickModel> pickNumbers = new ArrayList<>();
//        add(new PickModel(-1,R.drawable.pick2));
        //add(new PickModel(0,R.drawable.pick_zero));

        add(new PickModel(1,R.drawable.pick_two));
        add(new PickModel(2,R.drawable.pick_three));
        add(new PickModel(3,R.drawable.pick_four));
        add(new PickModel(4,R.drawable.pick_five));
        add(new PickModel(5,R.drawable.pick_six));
        add(new PickModel(6,R.drawable.pick_seven));
        add(new PickModel(7,R.drawable.pick_eight));
        add(new PickModel(8,R.drawable.pick_nine));
        add(new PickModel(9,R.drawable.pick_ten));
        add(new PickModel(10,R.drawable.pick_eleven));
        add(new PickModel(11,R.drawable.pick_twelve));
        add(new PickModel(12,R.drawable.pick_thirteen));
        add(new PickModel(13,R.drawable.pick_fourteen));
        add(new PickModel(14,R.drawable.pick_fifteen));
        add(new PickModel(15,R.drawable.pick_sixteen));
        add(new PickModel(16,R.drawable.pick_seventeen));
        add(new PickModel(17,R.drawable.pick_eighteen));
        add(new PickModel(18,R.drawable.pick_nineteen));
        add(new PickModel(19,R.drawable.pick_twenty));
        add(new PickModel(20,R.drawable.pick_twenty_one));
        add(new PickModel(21,R.drawable.pick_twenty_two));
        add(new PickModel(22,R.drawable.pick_twenty_three));
        add(new PickModel(23,R.drawable.pick_twenty_four));
        add(new PickModel(24,R.drawable.pick_twenty_five));
        add(new PickModel(25,R.drawable.pick_twenty_six));
        add(new PickModel(26,R.drawable.pick_twenty_seven));
        add(new PickModel(27,R.drawable.pick_twenty_eight));
        add(new PickModel(28,R.drawable.pick_twenty_nine));
        add(new PickModel(29,R.drawable.pick_thirty));
        add(new PickModel(30,R.drawable.pick_thirty_one));
        add(new PickModel(31,R.drawable.pick_thirty_two));
        add(new PickModel(32,R.drawable.pick_thirty_three));
        add(new PickModel(33,R.drawable.pick_thirty_four));
        add(new PickModel(34,R.drawable.pick_thirty_five));
        add(new PickModel(35,R.drawable.pick_thirty_six));
        add(new PickModel(36,R.drawable.pick_one));
    }};

    public static ArrayList<PickModel> pickNumberRequests = new ArrayList<PickModel>(){{
        add(new PickModel(-1,R.drawable.pick2));
        add(new PickModel(0,R.drawable.number_zero_pick_request));
        add(new PickModel(1,R.drawable.number_one_pick_request));
        add(new PickModel(2,R.drawable.number_two_pick_request));
        add(new PickModel(3,R.drawable.number_three_pick_request));
        add(new PickModel(4,R.drawable.number_four_pick_request));
        add(new PickModel(5,R.drawable.number_five_pick_request));
        add(new PickModel(6,R.drawable.number_six_pick_request));
        add(new PickModel(7,R.drawable.number_seven_pick_request));
        add(new PickModel(8,R.drawable.number_eight_pick_request));
        add(new PickModel(9,R.drawable.number_nine_pick_request));
    }};

    public static ArrayList<PickModel> pick2NumberRequests = new ArrayList<PickModel>(){{
        add(new PickModel(-1,R.drawable.pick2));
        // add(new PickModel(0,R.drawable.number_zero_pick_request));
        add(new PickModel(0,R.drawable.number_one_pick_request));
        add(new PickModel(1,R.drawable.number_two_pick_request));
        add(new PickModel(2,R.drawable.number_three_pick_request));
        add(new PickModel(3,R.drawable.number_four_pick_request));
        add(new PickModel(4,R.drawable.number_five_pick_request));
        add(new PickModel(5,R.drawable.number_six_pick_request));
        add(new PickModel(6,R.drawable.number_seven_pick_request));
        add(new PickModel(7,R.drawable.number_eight_pick_request));
        add(new PickModel(8,R.drawable.number_nine_pick_request));
        add(new PickModel(9,R.drawable.number_ten_pick_request));
        add(new PickModel(10,R.drawable.number_eleven_pick_request));
        add(new PickModel(11,R.drawable.number_twelve_pick_request));
        add(new PickModel(12,R.drawable.number_thirteen_pick_request));
        add(new PickModel(13,R.drawable.number_fourteen_pick_request));
        add(new PickModel(14,R.drawable.number_fifteen_pick_request));
        add(new PickModel(15,R.drawable.number_sixteen_pick_request));
        add(new PickModel(16,R.drawable.number_seventeen_pick_request));
        add(new PickModel(17,R.drawable.number_eighteen_pick_request));
        add(new PickModel(18,R.drawable.number_nineteen_pick_request));
        add(new PickModel(19,R.drawable.number_twenty_pick_request));
        add(new PickModel(20,R.drawable.number_twenty_one_pick_request));
        add(new PickModel(21,R.drawable.number_twenty_two_pick_request));
        add(new PickModel(22,R.drawable.number_twenty_three_pick_request));
        add(new PickModel(23,R.drawable.number_twenty_four_pick_request));
        add(new PickModel(24,R.drawable.number_twenty_five_pick_request));
        add(new PickModel(25,R.drawable.number_twenty_six_pick_request));
        add(new PickModel(26,R.drawable.number_twenty_seven_pick_request));
        add(new PickModel(27,R.drawable.number_twenty_eight_pick_request));
        add(new PickModel(28,R.drawable.number_twenty_nine_pick_request));
        add(new PickModel(29,R.drawable.number_thirty_pick_request));
        add(new PickModel(30,R.drawable.number_thirty_one_pick_request));
        add(new PickModel(31,R.drawable.number_thirty_two_pick_request));
        add(new PickModel(32,R.drawable.number_thirty_three_pick_request));
        add(new PickModel(33,R.drawable.number_thirty_four_pick_request));
        add(new PickModel(34,R.drawable.number_thirty_five_pick_request));
        add(new PickModel(35,R.drawable.number_thirty_six_pick_request));
    }};

    public static HashMap<String, Integer> getjackpotnumber = new HashMap<String, Integer>(){{
        put("0",R.drawable.jackpottext0);
        put("1",R.drawable.jackpottext1);
        put("2",R.drawable.jackpottext2);
        put("3",R.drawable.jackpottext3);
        put("4",R.drawable.jackpottext4);
        put("5",R.drawable.jackpottext5);
        put("6",R.drawable.jackpottext6);
        put("7",R.drawable.jackpottext7);
        put("8",R.drawable.jackpottext8);
        put("9",R.drawable.jackpottext9);
        put(",",R.drawable.jackpottextcom);

    }};
    public static String getFormattedAmount(String amount){
        DecimalFormat formatter = new DecimalFormat("###,###,###");
        String famount = formatter.format(Double.parseDouble(amount));
        return famount;
    }

    public static int getLucky5ColorId(int number){
        if(number==1 || number==6 || number==11|| number==16|| number==21 ||number==26 ){
            return R.drawable.lucky5_green;
        }
        else if(number==2 || number==7 || number==12|| number==17|| number==22)
            return R.drawable.lucky5_yellow_green;
        else if(number==3 || number==8 || number==13|| number==18|| number==23)
            return R.drawable.lucky5_red;
        else if(number==4 || number==9 || number==14|| number==19|| number==24)
            return R.drawable.lucky5_blue;
        else if(number==5 || number==10 || number==15|| number==20|| number==25)
            return R.drawable.lucky5_yellow_orange;
        else
            return 0;
    }

    public static Integer getdrwable(String key){
        return getjackpotnumber.get(key);
    }
    public static ArrayList<PickModel> getDefaultPickNumberSlots(){
        return pickModels;
    }

    public static Integer getPickNumberRequest(int position){
        for (int i=0;i<pickNumberRequests.size();i++){
            if (pickNumberRequests.get(i).getNumber() == position){
                return pickNumberRequests.get(i).getImage();
            }
        }
        return pickNumberRequests.get(0).getImage();
    }

    public static ArrayList<PickModel> getDefaultPick2NumberSlots(){
        return pick2Models;
    }

    public static Integer getPick2NumberRequest(int position){
        for (int i=0;i<pick2NumberRequests.size();i++){
            if (pick2NumberRequests.get(i).getNumber() == position){
                return pick2NumberRequests.get(i).getImage();
            }
        }
        return pick2NumberRequests.get(0).getImage();
    }


    public static ArrayList<PickModel> getDefaultPick3NumberSlots(){
        return pick3Models;
    }

    public static Integer getPick3NumberRequest(int position){
        for (int i=0;i<pickNumberRequests.size();i++){
            if (pickNumberRequests.get(i).getNumber() == position){
                return pickNumberRequests.get(i).getImage();
            }
        }
        return pickNumberRequests.get(0).getImage();
    }
    public static ArrayList<PickModel> getDefaultPick4NumberSlots(){
        return pickModels;
    }
    public static HashMap<String, Integer> betTypeFactorMapping = new HashMap<String, Integer>(){{
        put("COMBO10",210);
        put("COMBO4",561);
        put("COMBO5",33);
        put("COMBO7",7);
        put("COMBO8",28);
        put("COMBO9",84);
        put("REGULAR",1);
    }};

    public static Integer getBetFactor(String betType){
        return betTypeFactorMapping.get(betType);
    }
}
