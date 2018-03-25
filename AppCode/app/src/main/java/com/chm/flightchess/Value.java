package com.chm.flightchess;


public class Value {
    static final int Terminal = 56;
    static final int red_team = 0;
    static final int yellow_team = 3;
    static final int blue_team = 1;
    static final int green_team = 2;
    static final String  PlayerName[] = new String[]{"红色","蓝色","绿色","黄色"};
    static final float redoriginx[] = new float[]{70.875f,70.875f,155.025f,155.025f};
    static final float redoriginy[] = new float[]{148,60,60,148};
    static final float blueoriginx[] = new float[]{857.25f,941.625f,941.625f,857.25f};
    static final float blueoriginy[] = new float[]{60,56,144,144};
    static final float greenoriginx[] = new float[]{945f,945f,860.625f,860.625f};
    static final float greenoriginy[] = new float[]{836,924,924,840};
    static final float yelloworiginx[] = new float[]{148.5f,64.125f,64.125f,148.5f};
    static final float yelloworiginy[] = new float[]{924,924,836,836};
    static final int redPathx[]=new int[]{
            0,//1
            4,13,19,26,30,28,28,//8
            28,38,44,50,56,62,71,//15
            71,71,69,73,80,86,93,//22
            96,96,96,96,96,//27
            93,86,80,73,69,71,71,//34
            71,62,56,50,44,38,28,//41
            28,28,30,26,19,13,4,
            3,3,
            3,11,18,24,30,36,43
    };
    static final int redPathy[]=new int[]{
            23,//1
            28,28,28,30,26,19,13,//8
            4,4,4,4,4,4,5,//15
            13,19,26,31,28,28,31,//22
            37,43,49,55,61,//27
            67,69,69,67,72,79,85,//34
            94,94,94,94,94,94,94,//41
            85,79,72,67,69,69,67,
            61,55,//2
            49,49,49,49,49,49,49
    };
    static final int yellowPathx[]=new int[]{
            22,
            28,//41
            28,28,30,26,19,13,4,
            3,3,
            3,3,3,4,13,19,26,30,28,28,//8
            28,38,44,50,56,62,71,//15
            71,71,69,73,80,86,93,//22
            96,96,96,96,96,//27
            93,86,80,73,69,71,71,//34
            71,62,56,50,
            50,50,50,50,50,50
    };
    static final int yellowPathy[]=new int[]{
            97,
            94,//41
            85,79,72,67,69,69,67,
            61,55,//2
            49,43,37,28,28,28,30,26,19,13,//8
            4,4,4,4,4,4,5,//15
            13,19,26,31,28,28,31,//22
            37,43,49,55,61,//27
            67,69,69,67,72,79,85,//34
            94,94,94,94,86,80,74,68,62,54
    };
    static final int bluePathx[]=new int[]{
            77,
            71,//15
            71,71,69,73,80,86,93,//22
            96,96,96,96,96,//27
            93,86,80,73,69,71,71,//34
            71,62,56,50,44,38,28,//41
            28,28,30,26,19,13,4,
            3,3,
            3,3,3,4,13,19,26,30,28,28,//8
            28,38,44,50,50,50,50,50,50,50
    };
    static final int bluePathy[]=new int[]{
            0,
            5,//15
            13,19,26,31,28,28,31,//22
            37,43,49,55,61,//27
            67,69,69,67,72,79,85,//34
            94,94,94,94,94,94,94,//41
            85,79,72,67,69,69,67,
            61,55,//2
            49,43,37,28,28,28,30,26,19,13,//8
            4,4,4,4,12,18,24,30,36,43
    };
    static final int greenPathx[]=new int[]{
            99,
            93,86,80,73,69,71,71,//34
            71,62,56,50,44,38,28,//41
            28,28,30,26,19,13,4,
            3,3,
            3,3,3,4,13,19,26,30,28,28,//8
            28,38,44,50,56,62,71,//15
            71,71,69,73,80,86,93,//22
            96,96,96,88,82,76,70,64,54//27
    };
    static final int greenPathy[]=new int[]{
            77,
            67,69,69,67,72,79,85,//34
            94,94,94,94,94,94,94,//41
            85,79,72,67,69,69,67,
            61,55,//2
            49,43,37,28,28,28,30,26,19,13,//8
            4,4,4,4,4,4,5,//15
            13,19,26,31,28,28,31,//22
            37,43,49,49,49,49,49,49,49//27
    };
}