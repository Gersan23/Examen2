/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.awt.Image;
import javax.swing.ImageIcon;
import imagenes.DevuelveImagen;
import Modelo.Pokemon;


/**
 *
 * @author llasu
 */
public class VectorPokemon {
    private Pokemon vectorPoke[];
    DevuelveImagen imagen= new DevuelveImagen();
    Pokemon poke1,poke2,poke3,poke4,poke5,poke6,poke7,poke8,poke9,poke10,poke11,poke12,poke13,poke14,poke15,poke16,poke17,poke18,poke19,
            poke20,poke21,poke22,poke23,poke24,poke25,poke26,poke27,poke28,poke29,poke30,poke31,poke32,poke33,poke34,poke35,poke36,poke37,poke38,poke39,
            poke40,poke41,poke42,poke43,poke44,poke45,poke46,poke47,poke48,poke49,poke50,poke51,poke52,poke53,poke54,poke55,poke56,poke57,poke58,poke59,
            poke60,poke61,poke62,poke63,poke64,poke65,poke66,poke67,poke68,poke69,poke70,poke71,poke72,poke73,poke74,poke75,poke76,poke77,poke78,poke79,
            poke80,poke81,poke82,poke83,poke84,poke85,poke86,poke87,poke88,poke89,poke90,poke91,poke92,poke93,poke94,poke95,poke96,poke97,poke98,poke99,
            poke100,poke101,poke102,poke103,poke104,poke105,poke106,poke107,poke108,poke109,poke110,poke111,poke112,poke113,poke114,poke115,poke116,poke117,poke118,poke119,
            poke120,poke121,poke122,poke123,poke124,poke125,poke126,poke127,poke128,poke129,poke130,poke131,poke132,poke133,poke134,poke135,poke136,poke137,poke138,poke139,
            poke140,poke141,poke142,poke143,poke144,poke145,poke146,poke147,poke148,poke149,poke150,poke151;
            
    public VectorPokemon(){
        vectorPoke= new Pokemon[151];
        inicializarPokemon();
    }
    public Pokemon poke(int posicion){
        return vectorPoke[posicion];
    }
    
    public void inicializarPokemon(){//buscar metodo 
        poke1 = new Pokemon("Bulbasaur",0,"1",imagen.inicializarPokemon(1),"");
        vectorPoke[0]=poke1; 
        poke2 = new Pokemon("Ivysaur",0,"2",imagen.inicializarPokemon(2),"");
        vectorPoke[1]=poke2;
        poke3 = new Pokemon("Venusaur",0,"3",imagen.inicializarPokemon(3),"");
        vectorPoke[2]=poke3; 
        poke4 = new Pokemon("Charmander",0,"4",imagen.inicializarPokemon(4),"");
        vectorPoke[3]=poke4;
        poke5 = new Pokemon("Charmeleon",0,"5",imagen.inicializarPokemon(5),"");
        vectorPoke[4]=poke5;
        poke6= new Pokemon("Charizard",0,"6",imagen.inicializarPokemon(6),"");
        vectorPoke[5]=poke6;
        poke7 = new Pokemon("Squirtle",0,"7",imagen.inicializarPokemon(7),"");
        vectorPoke[6]=poke7;
        poke8 = new Pokemon("Wartortle",0,"8",imagen.inicializarPokemon(8),"");
        vectorPoke[7]=poke8;
        poke9 = new Pokemon("Blastoise",0,"9",imagen.inicializarPokemon(9),"");
        vectorPoke[8]=poke9;
        poke10 = new Pokemon("Caterpie",0,"10",imagen.inicializarPokemon(10),"");
        vectorPoke[9]=poke10;
        poke11= new Pokemon("Metapood",0,"11",imagen.inicializarPokemon(11),"");
        vectorPoke[10]=poke11;
        poke12 = new Pokemon("Buterfree",0,"12",imagen.inicializarPokemon(12),""); 
        vectorPoke[11]=poke12;
        poke13= new Pokemon("Weedle",0,"13",imagen.inicializarPokemon(13),"");
        vectorPoke[12]=poke13;
        poke14= new Pokemon("Kakuna",0,"14",imagen.inicializarPokemon(14),"");
        vectorPoke[13]=poke14; 
        poke15 = new Pokemon("Beedrill",0,"15",imagen.inicializarPokemon(15),"");
        vectorPoke[14]=poke15; 
        poke16 = new Pokemon("Pidgey",0,"16",imagen.inicializarPokemon(16),"");
        vectorPoke[15]=poke16; 
        poke17 = new Pokemon("Pidgeotto",0,"17",imagen.inicializarPokemon(17),"");
        vectorPoke[16]=poke17; 
        poke18 = new Pokemon("Pidgeot",0,"18",imagen.inicializarPokemon(18),"");
        vectorPoke[17]=poke18; 
        poke19 = new Pokemon("Rattata",0,"19",imagen.inicializarPokemon(19),"");
        vectorPoke[18]=poke19; 
        poke20 = new Pokemon("Raticate",0,"20",imagen.inicializarPokemon(20),"");
        vectorPoke[19]=poke20; 
        poke21 = new Pokemon("Spearow",0,"21",imagen.inicializarPokemon(21),"");
        vectorPoke[20]=poke21; 
        poke22 = new Pokemon("Fearow",0,"22",imagen.inicializarPokemon(22),"");
        vectorPoke[21]=poke22; 
        poke23 = new Pokemon("Ekans",0,"23",imagen.inicializarPokemon(23),"");
        vectorPoke[22]=poke23; 
        poke24 = new Pokemon("Arbok",0,"24",imagen.inicializarPokemon(24),"");
        vectorPoke[23]=poke24; 
        poke25 = new Pokemon("Pikachu",0,"25",imagen.inicializarPokemon(25),"");
        vectorPoke[24]=poke25;
        poke26 = new Pokemon("Raichu",0,"26",imagen.inicializarPokemon(26),"");
        vectorPoke[25]=poke26;
        poke27 = new Pokemon("Sandshrew",0,"27",imagen.inicializarPokemon(27),"");
        vectorPoke[26]=poke27;
        poke28 = new Pokemon("Sandslash",0,"28",imagen.inicializarPokemon(28),"");
        vectorPoke[27]=poke28;
        poke29 = new Pokemon("Nidoran",0,"29",imagen.inicializarPokemon(29),"");
        vectorPoke[28]=poke29;
        poke30 = new Pokemon("Nidorina",0,"30",imagen.inicializarPokemon(30),"");
        vectorPoke[29]=poke30;
        poke31 = new Pokemon("Nidoqueen",0,"31",imagen.inicializarPokemon(31),"");
        vectorPoke[30]=poke31;
        poke32 = new Pokemon("Nidoran",0,"32",imagen.inicializarPokemon(32),"");
        vectorPoke[31]=poke32;
        poke33 = new Pokemon("Nidorino",0,"33",imagen.inicializarPokemon(33),"");
        vectorPoke[32]=poke33;
        poke34 = new Pokemon("Nidoking",0,"34",imagen.inicializarPokemon(34),"");
        vectorPoke[33]=poke34;
        poke35 = new Pokemon("Clefairy",0,"35",imagen.inicializarPokemon(35),"");
        vectorPoke[34]=poke35;
        poke36 = new Pokemon("Clefable",0,"36",imagen.inicializarPokemon(36),"");
        vectorPoke[35]=poke36;
        poke37= new Pokemon("Vulpix",0,"37",imagen.inicializarPokemon(37),"");
        vectorPoke[36]=poke37;
        poke38 = new Pokemon("Ninetales",0,"38",imagen.inicializarPokemon(38),"");
        vectorPoke[37]=poke38;
        poke39 = new Pokemon("Jigglypuff",0,"39",imagen.inicializarPokemon(39),"");
        vectorPoke[38]=poke39;
        poke40 = new Pokemon("Wigglytuff",0,"40",imagen.inicializarPokemon(40),"");
        vectorPoke[39]=poke40;
        poke41 = new Pokemon("Zubat",0,"41",imagen.inicializarPokemon(41),"");
        vectorPoke[40]=poke41;
        poke42 =new Pokemon("Golbat",0,"42",imagen.inicializarPokemon(42),"");
        vectorPoke[41]=poke42;
        poke43 =new Pokemon("Oddish",0,"43",imagen.inicializarPokemon(43),"");  
        vectorPoke[42]=poke43;
        poke44 =new Pokemon("Gloom",0,"44",imagen.inicializarPokemon(44),"");
        vectorPoke[43]=poke44;
        poke45 =new Pokemon("Vileplume",0,"45",imagen.inicializarPokemon(45),"");
        vectorPoke[44]=poke45;
        poke46 =new Pokemon("Paras",0,"46",imagen.inicializarPokemon(46),"");
        vectorPoke[45]=poke46;
        poke47 =new Pokemon("Parasect",0,"47",imagen.inicializarPokemon(47),"");
        vectorPoke[46]=poke47;
        poke48 =new Pokemon("Venonat",0,"48",imagen.inicializarPokemon(48),"");
        vectorPoke[47]=poke48;
        poke49 =new Pokemon("Venomoth",0,"49",imagen.inicializarPokemon(49),"");
        vectorPoke[48]=poke49;
        poke50 =new Pokemon("Diglett",0,"50",imagen.inicializarPokemon(50),"");
        vectorPoke[49]=poke50;
        poke51 =new Pokemon("Dugtrio",0,"51",imagen.inicializarPokemon(51),"");
        vectorPoke[50]=poke51;
        poke52 =new Pokemon("Meowth",0,"52",imagen.inicializarPokemon(52),"");
        vectorPoke[51]=poke52;
        poke53 =new Pokemon("Persian",0,"53",imagen.inicializarPokemon(53),"");
        vectorPoke[52]=poke53;
        poke54 =new Pokemon("Psyduck",0,"54",imagen.inicializarPokemon(54),"");
        vectorPoke[53]=poke54;
        poke55 =new Pokemon("Golduck",0,"55",imagen.inicializarPokemon(55),"");
        vectorPoke[54]=poke55;
        poke56 =new Pokemon("Mankey",0,"56",imagen.inicializarPokemon(56),"");
        vectorPoke[55]=poke56;
        poke57 =new Pokemon("Primeape",0,"57",imagen.inicializarPokemon(57),"");
        vectorPoke[56]=poke57;
        poke58 =new Pokemon("Growlithe",0,"58",imagen.inicializarPokemon(58),"");
        vectorPoke[57]=poke58;
        poke59 =new Pokemon("Arcanine",0,"59",imagen.inicializarPokemon(59),"");
        vectorPoke[58]=poke59;
        poke60 =new Pokemon("Poliwag",0,"60",imagen.inicializarPokemon(60),"");
        vectorPoke[59]=poke60;
        poke61 =new Pokemon("Poliwhirl",0,"61",imagen.inicializarPokemon(61),"");
        vectorPoke[60]=poke61;
        poke62 =new Pokemon("Poliwrath",0,"62",imagen.inicializarPokemon(62),"");
        vectorPoke[61]=poke62;
        poke63 =new Pokemon("Abra",0,"63",imagen.inicializarPokemon(63),"");
        vectorPoke[62]=poke63;
        poke64 =new Pokemon("Kadabra",0,"64",imagen.inicializarPokemon(64),"");
        vectorPoke[63]=poke64;
        poke65 =new Pokemon("Alakazam",0,"65",imagen.inicializarPokemon(65),"");
        vectorPoke[64]=poke65;
        poke66 =new Pokemon("Machop",0,"66",imagen.inicializarPokemon(66),"");
        vectorPoke[65]=poke66;
        poke67 =new Pokemon("Machoke",0,"67",imagen.inicializarPokemon(67),"");
        vectorPoke[66]=poke67;
        poke68 =new Pokemon("Machamp",0,"68",imagen.inicializarPokemon(68),"");
        vectorPoke[67]=poke68;
        poke69 =new Pokemon("Bellsprout",0,"69",imagen.inicializarPokemon(69),"");
        vectorPoke[68]=poke69;
        poke70 =new Pokemon("Weepinbell",0,"70",imagen.inicializarPokemon(70),"");
        vectorPoke[69]=poke70;
        poke71 =new Pokemon("Victrebel",0,"71",imagen.inicializarPokemon(71),"");
        vectorPoke[70]=poke71;
        poke72 =new Pokemon("Tentacool",0,"72",imagen.inicializarPokemon(72),"");
        vectorPoke[71]=poke72;
        poke73 =new Pokemon("Tentacruel",0,"73",imagen.inicializarPokemon(73),"");
        vectorPoke[72]=poke73;
        poke74 =new Pokemon("Geodude",0,"74",imagen.inicializarPokemon(74),"");
        vectorPoke[73]=poke74;
        poke75 =new Pokemon("Graveler",0,"75",imagen.inicializarPokemon(75),"");
        vectorPoke[74]=poke75;
        poke76 =new Pokemon("Golem",0,"76",imagen.inicializarPokemon(76),"");
        vectorPoke[75]=poke76;
        poke77 =new Pokemon("Ponyta",0,"77",imagen.inicializarPokemon(77),"");
        vectorPoke[76]=poke77;
        poke78 =new Pokemon("Rapidash",0,"78",imagen.inicializarPokemon(78),"");
        vectorPoke[77]=poke78;
        poke79 =new Pokemon("Slowpoke",0,"79",imagen.inicializarPokemon(79),"");
        vectorPoke[78]=poke79;
        poke80 =new Pokemon("Slowbro",0,"80",imagen.inicializarPokemon(80),"");
        vectorPoke[79]=poke80;
        poke81 =new Pokemon("Magnemite",0,"81",imagen.inicializarPokemon(81),"");
        vectorPoke[80]=poke81;
        poke82 =new Pokemon("Magneton",0,"82",imagen.inicializarPokemon(82),"");
        vectorPoke[81]=poke82;
        poke83 =new Pokemon("Farfetch´d",0,"83",imagen.inicializarPokemon(83),"");
        vectorPoke[82]=poke83;
        poke84 =new Pokemon("Doduo",0,"84",imagen.inicializarPokemon(84),"");
        vectorPoke[83]=poke84;
        poke85 =new Pokemon("Dodrio",0,"85",imagen.inicializarPokemon(85),"");
        vectorPoke[84]=poke85;
        poke86 =new Pokemon("Seel",0,"86",imagen.inicializarPokemon(86),"");
        vectorPoke[85]=poke86;
        poke87 =new Pokemon("Dewgong",0,"87",imagen.inicializarPokemon(87),"");
        vectorPoke[86]=poke87;
        poke88 =new Pokemon("Grimer",0,"88",imagen.inicializarPokemon(88),"");
        vectorPoke[87]=poke88;
        poke89 =new Pokemon("Muk",0,"89",imagen.inicializarPokemon(89),"");
        vectorPoke[88]=poke89;
        poke90 =new Pokemon("Shellder",0,"90",imagen.inicializarPokemon(90),"");
        vectorPoke[89]=poke90;
        poke91 =new Pokemon("Cloyster",0,"91",imagen.inicializarPokemon(91),"");
        vectorPoke[90]=poke91;
        poke92 =new Pokemon("Gastly",0,"92",imagen.inicializarPokemon(92),"");
        vectorPoke[91]=poke92;
        poke93 =new Pokemon("Haunter",0,"93",imagen.inicializarPokemon(93),"");
        vectorPoke[92]=poke93;
        poke94 =new Pokemon("Gengar",0,"94",imagen.inicializarPokemon(94),"");
        vectorPoke[93]=poke94;
        poke95 =new Pokemon("Onix",0,"95",imagen.inicializarPokemon(95),"");
        vectorPoke[94]=poke95;
        poke96 =new Pokemon("Drowzee",0,"96",imagen.inicializarPokemon(96),"");
        vectorPoke[95]=poke96;
        poke97 =new Pokemon("Hypno",0,"97",imagen.inicializarPokemon(97),"");
        vectorPoke[96]=poke97;
        poke98 =new Pokemon("Krabby",0,"98",imagen.inicializarPokemon(98),"");
        vectorPoke[97]=poke98;
        poke99 =new Pokemon("Kingler",0,"99",imagen.inicializarPokemon(99),"");
        vectorPoke[98]=poke99;
        poke100 =new Pokemon("Voltorb",0,"100",imagen.inicializarPokemon(100),"");
        vectorPoke[99]=poke100;
        poke101=new Pokemon("Electrode",0,"101",imagen.inicializarPokemon(101),"");
        vectorPoke[100]=poke101;
        poke102=new Pokemon("Exeggcute",0,"102",imagen.inicializarPokemon(102),"");
        vectorPoke[101]=poke102;
        poke103=new Pokemon("Exeggutor",0,"103",imagen.inicializarPokemon(103),"");
        vectorPoke[102]=poke103;
        poke104=new Pokemon("Cubone",0,"104",imagen.inicializarPokemon(104),"");
        vectorPoke[103]=poke104;
        poke105=new Pokemon("Marowak",0,"105",imagen.inicializarPokemon(105),"");
        vectorPoke[104]=poke105;
        poke106=new Pokemon("Hitmonlee",0,"106",imagen.inicializarPokemon(106),"");
        vectorPoke[105]=poke106;
        poke107=new Pokemon("Hitmonchan",0,"107",imagen.inicializarPokemon(107),"");
        vectorPoke[106]=poke107;
        poke108=new Pokemon("Lickitung",0,"108",imagen.inicializarPokemon(108),"");
        vectorPoke[107]=poke108;
        poke109=new Pokemon("Koffing",0,"109",imagen.inicializarPokemon(109),"");
        vectorPoke[108]=poke109;
        poke110=new Pokemon("Weezing",0,"110",imagen.inicializarPokemon(110),"");
        vectorPoke[109]=poke110;
        poke111=new Pokemon("Rhyhorn",0,"111",imagen.inicializarPokemon(111),"");
        vectorPoke[110]=poke111;
        poke112=new Pokemon("Rhydon",0,"112",imagen.inicializarPokemon(112),"");
        vectorPoke[111]=poke112;
        poke113=new Pokemon("Chansey",0,"113",imagen.inicializarPokemon(113),"");
        vectorPoke[112]=poke113;
        poke114=new Pokemon("Tangela",0,"114",imagen.inicializarPokemon(114),"");
        vectorPoke[113]=poke114;
        poke115=new Pokemon("Kangaskhan",0,"115",imagen.inicializarPokemon(115),"");
        vectorPoke[114]=poke115;
        poke116=new Pokemon("Horsea",0,"116",imagen.inicializarPokemon(116),"");
        vectorPoke[115]=poke116;
        poke117=new Pokemon("Seadra",0,"117",imagen.inicializarPokemon(117),"");
        vectorPoke[116]=poke117;
        poke118=new Pokemon("Goldeen",0,"118",imagen.inicializarPokemon(118),"");
        vectorPoke[117]=poke118;
        poke119=new Pokemon("Seaking",0,"119",imagen.inicializarPokemon(119),"");
        vectorPoke[118]=poke119;
        poke120=new Pokemon("Staryu",0,"120",imagen.inicializarPokemon(120),"");
        vectorPoke[119]=poke120;
        poke121=new Pokemon("Starmie",0,"121",imagen.inicializarPokemon(121),"");
        vectorPoke[120]=poke121;
        poke122=new Pokemon("Mr.Mine",0,"122",imagen.inicializarPokemon(122),"");
        vectorPoke[121]=poke122;
        poke123=new Pokemon("Scyther",0,"123",imagen.inicializarPokemon(124),"");
        vectorPoke[122]=poke123;
        poke124=new Pokemon("Jynx",0,"124",imagen.inicializarPokemon(124),"");
        vectorPoke[123]=poke124;
        poke125=new Pokemon("Electabuzz",0,"125",imagen.inicializarPokemon(125),"");
        vectorPoke[124]=poke125;
        poke126=new Pokemon("Magmar",0,"126",imagen.inicializarPokemon(126),"");
        vectorPoke[125]=poke126;
        poke127=new Pokemon("Pinsir",0,"127",imagen.inicializarPokemon(127),"");
        vectorPoke[126]=poke127;
        poke128=new Pokemon("Tauros",0,"128",imagen.inicializarPokemon(128),"");
        vectorPoke[127]=poke128;
        poke129=new Pokemon("Magikarp",0,"129",imagen.inicializarPokemon(129),"");
        vectorPoke[128]=poke129;
        poke130=new Pokemon("Gyarados",0,"130",imagen.inicializarPokemon(130),"");
        vectorPoke[129]=poke130;
        poke131=new Pokemon("Lapras",0,"131",imagen.inicializarPokemon(131),"");
        vectorPoke[130]=poke131;
        poke132=new Pokemon("Ditto",0,"132",imagen.inicializarPokemon(132),"");
        vectorPoke[131]=poke132;
        poke133=new Pokemon("Eevee",0,"133",imagen.inicializarPokemon(133),"");
        vectorPoke[132]=poke133;
        poke134=new Pokemon("Vaporeon",0,"134",imagen.inicializarPokemon(134),"");
        vectorPoke[133]=poke134;
        poke135=new Pokemon("Jolteon",0,"135",imagen.inicializarPokemon(135),"");
        vectorPoke[134]=poke135;
        poke136=new Pokemon("Flareon",0,"136",imagen.inicializarPokemon(136),"");
        vectorPoke[135]=poke136;
        poke137=new Pokemon("Porygon",0,"137",imagen.inicializarPokemon(137),"");
        vectorPoke[136]=poke137;
        poke138=new Pokemon("Omanyte",0,"138",imagen.inicializarPokemon(138),"");
        vectorPoke[137]=poke138;
        poke139=new Pokemon("Omastar",0,"139",imagen.inicializarPokemon(139),"");
        vectorPoke[138]=poke139;
        poke140=new Pokemon("Kabuto",0,"140",imagen.inicializarPokemon(140),"");
        vectorPoke[139]=poke140;
        poke141=new Pokemon("Kabutops",0,"141",imagen.inicializarPokemon(141),"");
        vectorPoke[140]=poke141;
        poke142=new Pokemon("Aerodactyl",0,"142",imagen.inicializarPokemon(142),"");
        vectorPoke[141]=poke142;
        poke143=new Pokemon("Snorlax",0,"143",imagen.inicializarPokemon(143),"");
        vectorPoke[142]=poke143;
        poke144=new Pokemon("Articuno",0,"144",imagen.inicializarPokemon(144),"");
        vectorPoke[143]=poke144;
        poke145=new Pokemon("Zapdos",0,"145",imagen.inicializarPokemon(145),"");
        vectorPoke[144]=poke145;
        poke146=new Pokemon("Moltres",0,"146",imagen.inicializarPokemon(146),"");
        vectorPoke[145]=poke146;
        poke147=new Pokemon("Dratini",0,"147",imagen.inicializarPokemon(147),"");
        vectorPoke[146]=poke147;
        poke148=new Pokemon("Dragonair",0,"148",imagen.inicializarPokemon(148),"");
        vectorPoke[147]=poke148;
        poke149=new Pokemon("Dragonite",0,"149",imagen.inicializarPokemon(149),"");
        vectorPoke[148]=poke149;
        poke150=new Pokemon("Mewtwo",0,"150",imagen.inicializarPokemon(150),"");
        vectorPoke[149]=poke150;
        poke151=new Pokemon("Mew",0,"151",imagen.inicializarPokemon(151),"");
        vectorPoke[150]=poke151;
        
    }
    
    public int getTamano(){
        return vectorPoke.length;
    }
    
    
}//Fin de la class