import Arrays.Solution8;

import java.util.HashMap;
import java.util.Map;


public class engine {
    private static int[] height;
    static{
        height = new int[]{10527,740,9013,1300,29680,4898,13993,15213,18182,24254,3966,24378,11522,9190,6389,32067,21464,7115,7760,3925,31608,16047,239,31891,10104,29694,17723,4544,32111,20700,13463,19213,28584,786,22934,9846,1662,10909,26891,1810,21501,8042,28932,16709,8007,32548,32592,14134,24374,19787,4414,6531,18499,22918,12456,8244,29095,24634,25136,20462,21952,6491,18634,8041,12725,10626,8827,4388,2141,10560,608,5464,19549,14003,27633,18474,30097,17750,13191,24612,1454,8221,18460,24806,16421,20930,19026,26137,6474,26457,5303,6821,8373,16683,6472,12324,27368,26049,14388,27286,15923,2879,29666,5206,1749,19188,9780,28237,22116,13102,6926,28773,29295,11091,13330,28224,13921,24109,31150,29739,19624,7814,15705,28749,791,31221,12569,31780,16009,28151,6217,23091,20936,29505,30105,31732,15277,21333,23126,9236,4232,31828,15084,30943,4801,18195,27817,6906,16064,25456,12483,5200,19979,24295,28829,13134,30126,31072,3910,9811,25568,15435,29762,27490,16611,2031,13198,26651,14124,2815,30430,15849,18116,22639,3113,11900,26606,3973,15719,9338,16650,18995,21914,13425,29625,17828,30475,10769,17730,30997,9942,30104,9781,3814,12712,3469,23886,29681,19912,6321,22939,28954,7764,29747,28641,807,31694,27171,1853,25811,9687,11305,30983,32541,16953,26231,10235,13286,19755,32508,4763,14011,24273,21722,25807,26608,27139,5147,19663,26094,22607,29087,5954,18637,10049,25433,22184,15398,27361,10428,6645,27426,22910,14191,30334,29399,17578,24648,26905,20181,9094,16504,21120,29691,4672,21251,4855,3472,27353,13940,2351,4239,23340,31438,30825,6465,7212,3013,6622,18193,11885,2862,23903,2717,16358,12213,7481,6665,7925,31694,18779,32664,24227,24814,19899,30333,4138,8954,14325,2542,13748,4096,24629,10875,21094,24613,6488,11678,15261,20958,11342,27539,3959,22115,8899,28521,29846,25185,9470,27994,1824,14063,28425,29528,5898,14020,8466,2024,7063,7079,28433,11059,27,8230,29611,28250,11781,29067,10838,5387,30748,32268,21695,30034,19209,29506,20329,2481,18198,221,6550,26994,10037,13205,5226,6972,6468,31844,15694,30181,27535,14322,26515,903,13207,19025,14679,6870,21010,8938,28589,8880,30770,15543,11768,13302,4650,28339,23704,3483,15087,8335,23241,3834,7483,14247,1991,11373,26072,20532,26423,4635,11035,5827,25794,26897,28079,21990,31491,29333,5779,3113,16803,28086,5734,7751,9922,31528,2531,31134,22425,29519,1960,15073,7262,25242,31547,11533,11112,8210,12622,13470,14228,12851,31042,31490,15847,30202,32747,28238,22133,15423,18323,26928,3201,20805,24897,5924,485,8848,19259,26859,25013,30454,6345,11578,26143,27897,18236,8623,30101,13140,25647,4104,6959,12244,26893,19351,24138,2153,28627,8945,15734,17021,9495,6631,20623,27780,6986,32695,22057,1493,25402,13699,12337,6328,3546,14593,5074,15040,31558,18293,28822,26459,6914,11484,21198,26791,386,4970,17715,17031,30448,26423,30157,21495,25385,8758,8724,8860,15113,5222,3670,1183,21224,31820,3160,7356,14948,928,21824,23702,1377,29767,15026,334,9807,14721,29498,15955,15788,356,1514,2684,713,4745,6468,17236,10704,10757,10586,6837,27398,30106,26931,664,3918,32303,21361,2859,9711,5758,11825,26404,18326,8717,1587,2645,2719,18527,25915,5761,3216,26731,18358,2671,13542,24653,5537,26428,5397,32060,8871,16373,2506,10172,31113,26470,371,8212,30403,12332,3073,24323,30317,29458,6124,28335,6495,20378,120,20446,26008,23257,20792,16232,17889,12424,25296,28653,11437,6745,13566,3011,24132,16775,10716,4914,9760,7857,1631,27364,31639,7144,23588,11927,22971,7431,16492,7189,20095,25154,29797,10854,1307,30978,25259,8516,20401,12017,5646,17615,29744,15184,3478,27010,16505,4753,4548,1126,10688,6178,28443,2949,31541,8839,14815,15010,22500,1451,32541,4135,5082,6008,1771,5727,10378,25253,3057,19685,18543,31695,3112,18013,22002,11468,5858,20065,16781,27196,15371,11198,4913,18272,174,21217,8933,23600,31930,7308,17585,20903,1543,21710,27578,2146,3220,13873,2222,3433,3091,9525,10082,20813,13991,16381,4026,21875,15596,5705,28106,17327,22328,7588,17722,9236,29728,13791,13295,9483,12350,20925,18407,10659,31538,6128,27749,4648,3559,4164,12879,29431,5656,12571,30676,11664,15122,24857,13137,8173,24507,16672,25974,24083,17875,21119,30373,10726,30330,19814,922,7489,5106,15262,23889,14918,30887,11126,16420,22003,18284,3841,1589,4342,20744,7038,22795,21187,29425,15640,9856,31459,21335,29392,23770,15503,7780,9911,12856,22653,10435,22112,31536,10490,7007,8085,21686,13369,3181,1353,9535,14571,10668,206,14631,26895,22507,13128,32336,18188,27597,19298,8973,22781,24521,29503,7230,9804,11124,23220,22204,13186,8195,12724,6135,28765,28171,9995,20957,19492,14476,16207,28158,25655,22830,6164,21486,234,14794,27488,12011,21651,26412,26463,14016,12514,16664,11863,32745,9841,27530,4829,5880,17052,25922,25674,27448,24467,26496,24425,19599,15021,29453,6002,169,17664,11898,27452,13138,25134,31148,23214,17956,2433,23193,20599,17251,32059,10060,13310,30757,3111,4399,22428,31158,4468,30089,5898,6714,9923,5958,14869,4244,15487,9719,28569,22407,3181,13849,29868,2075,6788,3738,15386,13123,14334,28569,10770,32444,15535,13934,14366,2360,27286,746,5464,22972,12210,16863,5852,24135,14870,16611,3193,15796,4672,12114,19884,225,12199,12434,4814,22289,15251,25499,28300,31119,30257,950,31640,29333,29159,1668,4766,19307,6373,23363,7290,26067,12541,12109,21672,1189,20916,23521,4091,18359,153,24870,23442,7935,26581,4717,2057,30972,23300,22455,29932,12369,7747,10359,12401,31924,9098,9113,16230,27398,12861,26818,8552,8387,11517,5850,25942,28317,27076,5064,25093,30308,20529,380,26421,26665,12832,1075,31428,6819,4734,15862,30242,722,20060,9060,6149,20193,23617,3506,24158,10321,5573,11760,15499,24916,16219,17806,462,4471,17007,18462,1022,25988,19889,19035,25212,9895,20400,25195,30057,15567,32682,23905,15638,12375,26786,28166,26044,28390,10932,14553,13166,22420,26278,24916,27211,21070,1983,31857,1784,30331,24540,3181,23374,1247,18880,27084,25423,14528,17836,15773,26207,13384,17455,28927,14513,3115,4928,13796,12543,13962,8586,3349,9854,24854,3079,28023,2833,29304,10704,28812,30140,15089,2612,10300,12636,6205,6407,470,9110,4286,23868,23122,8206,10710,1463,10201,31705,32149,14428,23687,30004,21396,22380,26223,17270,16672,12561,28895,25411,5275,19767,19174,29443,4128,19870,5908,13202,14182,5165,10369,313,13543,9098,12560,22750,6721,28135,9461,15735,32732,1567,30581,4549,18381,26369,5357,14910,2042,17643,15894,6987,24447,7580,10375,18355,15185,31299,2172,29527,20001,6107,26581,32289,16260,27067,28258,11063,22096,10857,32605,22644,8777,28336,20536,18968,26877,28402,23706,24254,23020,31423,23460,16271,19948,19109,6776,24758,5580,9290,24572,26131,7224,1209,15835,16436,24284,17658,29389,5505,717,27877,16921,19382,2084,10295,25688,17815,24812,4582,30075,10463,28478,18866,1039,16505,11946,2045,9664,20210,3289,9180,13596,25903,13681,16238,7322,4443,21817,3693,21211,31268,6270,27394,27695,14887,26805,11486,25947,4008,11617,30342,2970,13447,5175,27886,9697,29295,9344,3402,17255,18257,8640,5409,21349,11793,405,12451,27162,24447,30945,25404,22291,8072,25643,24169,28841,27310,3907,15051,14539,6069,8229,18298,16126,16799,10528,25499,25505,3547,9784,5685,24694,8890,27080,22592,14942,25122,15468,17663,100,15494,13341,9360,31741,12309,1694,1218,13966,18482,23320,21542,30767,12581,24321,13161,9135,13328,8769,28896,5080,12068,32408,25189,24052,24084,3642,4450,7568,1738,30141,27947,11647,24154,1333,30609,29218,14900,29854,8116,6375,24989,16250,16152,28944,4960,25530,27899,16822,5056,2018,7142,16653,22194,19561,13699,4329,6729,19550,10414,25729,1394,4434,7630,13171,7905,32369,17766,7689,12363,30450,29927,26299,27094,17330,1481,9461,22990,31771,10969,5402,3225,30283,12245,10696,26861,626,22326,16990,7232,30076,19021,10939,11136,18161,20369,18505,31749,17945,15160,6203,26820,10851,19972,25362,14277,775,30304,18790,983,18923,10155,3555,28290,7620,15316,16530,11837,26493,4903,12121,19681,28380,26214,16326,10846,8803,32540,5640,6060,5748,18990,11582,7685,32697,30899,17653,18002,11459,8965,18411,29923,17137,8728,4121,11618,17044,4875,11249,21258,5712,14589,2277,14612,12742,12578,10024,6002,879,11542,15032,14272,15819,10097,23964,28280,15292,18075,14186,13413,1068,25058,15885,29786,12534,23753,29637,24867,15620,19619,18031,26556,32181,7265,29703,4545,19329,8873,6251,27686,7647,24104,18530,17960,7782,19496,24028,23683,30515,3429,22908,17638,24716,19740,32083,11684,12738,7782,1263,17836,31068,17348,7828,24763,24689,5371,2505,11216,23894,30498,32534,1505,31098,6905,17677,20684,11917,30076,5767,20112,7912,9912,15920,24253,11561,17118,2886,12329,14109,12694,925,15077,30692,6037,30439,5743,21839,32370,22322,41,7309,11957,31410,9738,29191,28722,10945,2452,30856,9365,9252,3846,29601,28733,27792,3282,26956,25934,8556,28497,1743,25857,9177,17590,19683,11071,17904,17729,18198,14447,23882,11189,21102,3468,24262,29195,14159,28282,26502,18024,6814,7834,22331,19533,2599,19356,24483,32269,10300,6804,11600,17029,15007,2896,3498,2823,8355,9705,13879,3479,29837,9881,4378,28506,23616,7116,13018,29515,19738,10874,23909,304,18201,27827,13397,6349,19266,7804,1649,1367,4419,3289,20599,25899,16471,31531,23833,22976,12138,29372,9797,29658,28798,12441,23465,12289,11085,9632,12919,5938,2863,15577,25189,22484,17471,23562,29689,27373,29625,21125,17411,6550,24487,10821,24683,30381,22973,3897,8748,8393,18817,16608,10401,24691,8623,16918,6656,30355,17627,15150,19748,12072,7512,16960,16527,3132,27737,32196,687,7448,5206,21856,28512,21940,25265,9471,26291,31345,7322,9763,24813,29706,21296,892,979,8136,17128,19129,7461,28662,16947,12446,9833,28821,859,23383,13801,1105,11694,9996,255,28083,4575,6325,21392,30871,32169,29488,8407,22497,29365,8848,4452,2924,17598,29113,12900,25155,25331,15914,10786,27924,20637,7705,5582,29921,4353,11461,29822,18937,2696,28936,17266,32551,9501,4651,12188,25897,10199,20223,95,23139,6616,27433,8088,17109,10869,1726,25307,15435,25751,5136,31231,25299,12640,24519,9948,14708,28178,24371,8787,2845,6445,14560,21135,22492,23256,15211,13963,8784,27778,13973,10964,12641,9161,27286,27537,6702,9371,436,30656,9799,32411,18451,14786,27165,14790,5583,6426,8119,5718,8008,22898,6566,998,8125,27358,25146,5080,4637,3941,23286,27380,27673,31166,28738,30289,3966,18775,13664,26489,26050,1948,31905,15304,23004,2677,16345,21269,9305,24592,27920,22933,7597,10210,27514,2299,2759,31976,27818,1252,6120,21811,24066,22131,30132,31395,3694,19256,19594,243,23634,15191,31249,23797,32704,31462,19731,287,17647,31382,13199,9031,19176,23446,3849,4011,6787,31412,8997,11572,10642,14022,21108,5884,7772,30280,7566,28429,26445,12358,6241,20076,31467,31869,18888,30294,21516,28349,10592,9929,32326,16785,12183,15942,18088,5154,11269,1750,25767,16217,22016,21579,12123,1604,19306,22472,13036,9659,29134,19587,14919,1859,28075,25034,8469,6962,9232,1604,493,7700,31337,30842,5320,19790,18585,16533,20918,20225,12617,30569,11216,20785,21631,32435,30830,9255,4210,3743,22170,21523,17565,15502,10948,1526,19218,24341,695,7103,7185,29513,30155,25524,20441,26426,21852,22292,29374,28093,16764,11259,24444,16239,30181,16005,5067,27894,25393,5430,13107,9866,26702,1178,11298,7349,16428,13864,13116,24150,30648,5740,2290,22508,14,28262,15702,22545,12522,11309,26157,15685,20320,7895,31558,12525,27854,10653,19723,5019,12814,12859,18774,32400,27376,20118,646,32384,26087,30113,11473,27541,31746,14209,1500,694,21790,16624,23176,9224,15451,11743,7951,23221,6348,28511,19793,4589,24179,18625,32104,6955,2924,10236,27778,27066,1384,23888,26096,10103,27485,30249,17018,1752,12156,16198,29174,30253,3428,12826,17177,6182,12437,20851,23948,9622,7975,14681,8770,7286,15548,26169,26122,24621,31155,30531,14944,12047,670,28688,14473,4387,1014,15752,735,9257,22030,515,28777,26843,9542,27822,5806,30068,27265,8241,9675,12655,18393,27790,19140,32401,7569,24652,3096,29481,27466,29910,21656,2455,20858,23070,8312,26891,18203,9605,167,11151,22432,26623,26716,17736,32045,28530,30962,28920,27399,14176,16373,17864,23626,19654,7037,23109,15066,10564,14522,6312,12955,18813,24785,10330,1253,705,2022,4279,12338,23530,21114,30995,16410,28035,1272,10746,22914,3376,4490,13244,22288,18505,14385,24105,2530,29129,27925,17818,29311,18279,31002,18737,1549,29186,2227,11873,21445,25922,7419,7600,7845,25213,4866,23739,16228,8919,13668,27003,25259,27822,3105,23240,30594,6197,24232,10779,25097,18270,7221,19096,18024,21758,7773,12620,8,16172,31208,12979,6404,4329,20958,22909,21978,3847,24804,6801,10599,11331,11465,2643,9490,2229,6237,30498,14663,106,18306,3365,23079,3407,2437,26440,23677,80,15790,12673,7924,21954,26133,16472,21384,10494,23736,16806,32059,2895,24267,27293,30217,16911,25167,18184,4381,12300,27110,3540,11589,28209,19174,7888,19364,22370,6572,3505,32423,2983,12339,24153,17722,11917,741,22105,9787,25801,14256,1972,8238,21791,13149,30950,16691,12418,4381,3620,31542,1405,14437,6118,2150,25297,1276,10915,29672,3424,13651,9179,6860,19785,4884,91,14656,5717,2557,26557,22531,3986,8431,4398,11805,15933,2370,25972,19150,22501,14428,559,7108,32718,16258,606,9104,29588,21997,12326,29787,27408,18721,975,17109,12159,18298,5136,9583,11745,14600,23436,21450,2208,6813,30620,31343,27762,3875,17487,30400,11392,6963,31151,3887,27080,16100,11846,31661,18880,25057,25313,21093,60,17855,31636,11435,12433,29325,18942,6191,27131,20908,3278,10359,17212,27361,2182,15500,22918,30632,7552,19699,13979,16587,32558,21982,25139,31284,28837,12708,8862,4351,10845,30575,12458,8148,19762,12852,25287,32116,1711,1001,4969,6545,19084,2290,18094,7139,17781,4060,21313,31096,27918,31053,4734,29772,20787,21563,23511,14617,4740,2653,20342,3952,8737,12511,13347,20489,11954,20826,27753,5464,25259,16131,18164,23136,22478,19491,11838,31692,25585,29639,31595,20284,8961,19384,28785,17629,25159,21165,7547,18236,20714,28352,13712,19804,6581,12319,5743,21254,18971,11268,1982,11104,10872,999,30052,25025,27546,27890,10548,7364,19840,19381,18379,14235,9057,14363,5307,1446,22769,32156,16873,29764,23775,27573,20019,32490,5282,2709,14166,10610,15733,2074,783,29877,24224,28923,25473,347,12538,2631,31447,21746,8108,24334,554,30014,17975,22109,22437,19920,4025,25968,14311,5082,23404,12836,9896,7234,19055,14763,19104,22517,6857,20355,16548,27262,13227,2217,10771,3799,18165,26378,31344,15999,11260,22842,18512,20172,22410,25192,9591,30851,5415,32402,16958,32166,26007,5877,24632,24973,9892,6856,22548,26424,26654,4137,14021,18916,4639,12632,13793,25564,16531,27171,4935,14226,30712,18849,3077,3822,5987,15395,32377,9446,11204,8552,30646,3407,2154,4880,12328,20211,18634,28499,15228,25571,8060,31731,28602,5135,5766,13679,18356,24083,9437,7802,17572,25172,15657,9131,4881,1100,14793,26486,30450,13858,18967,2651,17174,8830,17645,17245,24515,10395,1128,23734,9374,24222,12011,26825,2506,3622,4455,17240,29780,24356,28378,13047,8655,9453,26902,16065,30523,397,26308,3145,14124,21342,6824,22996,25384,8410,4135,26821,19536,30382,24838,27736,5954,27663,30836,20627,14143,16721,1867,28026,9353,19638,3475,31363,21007,10628,7496,22089,9804,23898,14940,30340,31597,26563,31744,5177,27314,28684,21280,26670,26390,1363,6700,2977,27442,9441,21022,20793,15967,31418,12473,10813,5403,4209,25614,27652,4270,24129,12101,2477,25101,29274,17562,5648,5118,8825,166,8691,16509,31675,27360,19074,13662,25779,8035,3065,19509,9658,1522,11428,31091,19334,31289,21513,22225,6143,18773,8804,11506,30029,10391,23635,16451,7990,2437,32467,25895,30375,28450,20331,8017,13200,10352,15527,20592,26869,5170,8904,14866,3907,20982,18618,22210,2272,1107,10566,20084,21765,2160,23689,2596,25808,18117,13733,10937,18069,294,26806,26415,7030,16893,19720,5621,2867,20695,3975,26004,10819,20514,26998,2194,1571,26676,12132,22678,19438,9104,19548,13516,15662,24677,32093,8075,26353,31576,24841,24374,20256,6019,12193,9824,3085,10174,12081,1843,31307,7453,14344,13842,1218,24250,23915,24445,13058,28340,3723,5429,29144,24695,17332,5793,18975,1086,3014,30833,31193,27607,3561,28545,9087,11430,21373,17152,1941,749,28240,10705,31872,14923,20244,5937,6300,32642,24592,15003,17034,32637,14357,14056,7111,30609,31156,21691,31107,6915,12974,13340,24496,29130,20396,16739,12889,5271,30768,29016,4405,27155,26316,2200,4476,18791,4498,29243,18937,9730,14027,27059,25953,10390,8684,31735,12003,22884,15557,9186,19712,16314,16636,1493,7837,6842,7610,3748,28246,5980,26020,31152,28694,10167,22797,592,15588,24444,24681,17526,16640,31171,2821,4239,20527,27658,26102,13994,21587,10874,16208,3293,19006,365,10648,13540,200,10286,21371,25868,19999,28927,1983,14416,12127,14945,27003,18881,1635,1423,16515,7979,27098,22092,27175,9973,15261,16350,16925,19785,31040,17243,6075,27765,31462,25379,873,7313,5210,4014,12375,9826,19548,20872,28267,7551,7737,21657,8318,26034,31135,14506,23239,10145,29870,19237,17815,30894,25682,3612,6215,14875,20177,12429,16495,29554,27808,23525,2393,11300,11131,31426,22454,2160,26548,23805,19855,11654,20428,23784,27262,12525,9792,27092,31773,5922,21925,7127,29375,9602,2807,13516,28254,2921,18991,12954,6101,9884,12563,22202,6735,26340,23634,18163,20736,5372,8912,11112,32019,173,6975,28117,6115,23096,8175,32278,5485,15092,17639,16361,11014,8504,29748,1524,28233,25467,9345,15882,24660,24250,24040,12970,14644,25627,264,1480,1949,10703,1112,18640,30942,17212,7098,21993,23829,25692,32340,20087,15263,29792,16027,25315,3027,13210,26800,18334,26096,30873,23280,31587,16467,18582,3271,17085,3310,20239,14276,31946,19189,30897,5875,13630,24794,13691,12391,6058,21116,9761,23830,10239,10140,14510,746,25678,5776,30830,13588,13265,18235,5387,11940,18223,16956,25846,23382,19964,24678,26376,25263,9599,20080,1898,26953,25785,30958,11186,31852,27042,29824,19022,23517,19382,13898,4390,5627,22448,12452,24445,10759,30870,10258,5912,9412,12789,21622,2211,27456,3950,8836,32592,10225,11633,10615,12225,3587,16201,10498,3624,26353,13913,9098,20397,7763,28325,26770,6928,16375,1172,9079,11407,7218,14324,16989,28938,1656,62,18793,23653,25131,13851,26161,32558,29105,30248,22384,8063,7113,8438,31999,22822,6943,7254,9216,2308,19486,14803,25436,1971,3333,26239,7281,30572,25661,2035,29700,10535,24810,10897,22397,23811,27072,25868,25171,25065,28183,5419,14277,22636,11586,22985,9419,7412,2077,28193,7756,7452,4326,19016,28561,7256,19790,11515,11514,11227,24271,29339,16111,22968,1343,23926,6426,23367,12198,13128,29139,14026,3917,21506,3548,12368,24855,11721,29775,32218,24852,12866,7892,1725,7252,12557,31255,12871,5369,15247,19066,2469,27792,30197,18695,12548,2210,31093,3240,31735,25989,11223,5018,8473,2936,12341,287,20723,23024,21759,25459,13344,7468,9025,5634,5294,8719,29481,5080,14024,15407,10692,20057,9362,29226,1032,23602,29013,17465,4887,5263,14300,16647,19906,27279,22558,23747,23372,7412,14365,15987,31601,3616,3085,30604,12199,22589,27065,22976,2468,29115,11043,24344,17184,30207,25706,22594,732,26201,28913,21804,29411,30519,23486,31698,3088,15769,10016,16724,15056,20677,14229,14667,16681,13372,26090,28509,31228,7660,31908,32527,24967,27815,9375,24027,1837,25300,1269,2947,19578,31077,6689,7332,5474,24329,2149,21390,19913,30626,28009,15187,26697,28665,29988,31006,14895,14768,13823,18374,22726,889,6200,20899,23513,390,19589,23713,10611,6721,5627,31890,12009,19260,27437,16329,11034,23147,12952,2532,28150,10129,7743,4329,12605,12792,27282,12437,28297,9829,1172,2032,22159,2379,23357,5413,19874,20799,24605,17297,4473,1452,31555,8218,27697,13768,30301,10178,6293,23494,8993,25723,15262,78,16619,19518,5942,12842,26023,5719,23105,9794,28145,31491,12766,5066,14459,4412,32746,8378,12463,16084,23239,29310,27798,28353,14939,14063,25081,440,30299,14723,30406,11517,31177,22720,28852,15225,20411,28663,2090,25869,27999,2350,8798,12326,23868,27486,30394,4497,12218,22751,9091,16017,21733,4640,30140,25903,17262,28827,26696,16082,4338,11784,7760,12559,24447,11217,23780,28866,17493,20167,18405,23390,3049,17171,26146,31361,32560,15471,12481,26060,3609,1686,12769,30449,860,31224,30333,1037,9586,10419,22419,5177,26852,22463,24198,16987,6089,6248,18626,16963,4746,5634,28318,15347,3561,27608,4486,28989,29250,5989,21849,24980,16400,23239,26896,24604,7602,9072,8865,20483,29296,18719,4642,31508,12985,14606,20530,13961,16814,24941,2965,18977,3045,28944,6686,19827,16230,16229,4306,28546,17658,28840,10058,23697,24230,10842,27225,13881,3954,27631,495,20920,12398,24519,3645,12428,22263,14431,24602,26433,28727,28105,4262,26247,13803,28505,15405,23175,24681,7586,25678,5239,14817,8352,15708,12908,30435,28215,27396,31088,30753,5340,28720,5589,22903,7827,22060,13769,29224,8217,20231,12842,10859,18530,22333,14747,18982,1094,6802,12759,9465,2679,8257,17221,18302,25526,598,17101,2511,17222,13401,28139,11081,17313,7468,11521,23440,23403,2102,20466,21715,7844,12738,30956,27474,8225,29345,10629,13853,1853,20247,9738,13598,11724,27893,8979,6233,23120,13570,29019,3187,27248,9119,7119,12401,421,3243,11237,6339,4151,22181,2095,897,18024,28944,8496,8692,18414,2588,24686,7000,13223,18306,3528,11488,21385,1712,7946,2811,2264,26662,9663,26582,18587,10784,20295,17186,15440,5749,11049,26391,23263,1983,11178,14009,3533,18876,5278,12634,14002,22772,19582,20320,10477,17820,17339,7240,27542,15803,26194,12779,22452,651,19361,30976,26288,19746,6264,21219,17674,26193,18292,4245,32075,30157,19336,23299,20283,19596,16605,28811,1875,11890,8156,23484,27253,24365,9865,1885,2523,30302,27666,21425,4942,16121,21159,4346,29080,9710,19341,828,20795,31753,8558,21315,23907,3862,15604,4327,18714,24138,6038,10895,30907,28126,20657,32244,24489,32253,6362,26152,26176,10464,26483,27350,27660,11320,11900,29899,14905,25036,172,11189,31307,11107,24000,24875,1296,21988,6420,11502,7634,14268,3696,7791,28112,3712,6436,10129,21488,24531,343,9391,23726,24971,21404,9697,30296,11535,22214,23931,13693,16899,5118,22487,15779,7208,9490,24661,8760,24701,15632,14239,21451,26027,7956,32562,28028,7071,30558,32282,30385,5753,19111,8956,27915,16549,28597,26458,10905,30791,18222,30739,31819,7133,9642,18217,31913,18976,9227,27335,1732,22826,18961,28035,21869,18654,18217,29664,8870,13445,11654,23319,23382,1973,25459,13591,15169,31351,16104,17866,25910,6312,32603,26010,19338,22688,6616,27956,31942,1298,2900,3723,10397,32307,9535,16160,28961,5663,2136,6018,23606,3192,16837,19472,31046,27984,15971,8966,3894,22345,2139,3000,26265,27898,758,15128,1060,30101,6322,29054,26466,28871,3989,19881,8617,8672,30657,20737,22861,22068,26697,31006,3347,27329,32323,4750,11241,21778,21022,10451,21716,13155,22326,14252,21289,10245,22950,406,11008,1028,3677,12177,18918,1288,26997,7719,12242,10873,11968,31659,9307,26086,28835,7103,19495,10920,28967,9240,12967,8386,6477,30342,7169,32524,31394,31790,13134,20625,3860,13850,26886,10549,11012,14069,5560,3483,21916,27151,13567,4677,31587,19368,19633,30205,12046,30314,21593,15220,27802,10807,12520,1578,4759,12325,6311,16013,1479,16327,29552,16741,13031,18863,2846,7791,25293,19248,8258,10824,5299,3945,14104,26509,21203,382,12473,2881,13620,29737,1169,8303,1731,626,11796,3856,16549,28090,8877,2606,20428,7422,25591,10570,22728,8538,560,12540,28128,25548,8939,20185,27490,24635,24580,19609,28215,4536,4825,32378,6330,29699,24503,28895,6603,15953,5523,6461,10782,15180,13819,3639,29657,25180,14668,2824,6239,5669,25380,16930,18534,11345,15130,17172,8784,8847,32173,30641,19128,9435,6523,31855,29515,18689,3252,22541,17369,9052,14029,22137,22955,6372,29305,2800,20760,4712,3029,15719,3411,29975,26338,18218,12935,1093,27193,8899,1574,4204,506,13085,10622,6001,20230,1513,25229,14889,22126,5441,26390,11036,17707,19595,24052,31369,7183,21665,2735,25514,22523,27439,22349,32568,27219,18780,12394,32562,5551,23980,26507,22491,723,23844,4016,31234,8674,28592,2088,645,11214,31683,10665,792,22547,21821,18848,18499,6821,21393,1990,16554,32294,4903,6644,27025,28253,26111,2616,25759,1764,14232,6952,6882,14880,26640,18038,4372,25718,25228,2501,20765,8124,29402,30139,3288,27374,7765,13144,24090,31267,1033,29574,18417,17087,2072,31985,23849,6121,20061,19480,12309,27456,18510,31141,28556,1481,23079,23289,21809,19756,23365,4364,18679,26913,30159,31092,24037,23845,10652,13763,3095,27249,30289,15638,19462,20012,28874,11243,30473,12256,18364,17971,4379,21547,31640,24489,24542,26551,19890,7777,29408,30315,10914,19364,285,25315,5098,9979,16326,29214,19674,28554,5697,16247,20145,6047,21361,11479,18437,22155,18487,9000,11109,3249,27449,14093,4412,11740,27106,1488,28920,9686,19114,24220,30060,27446,1175,3052,28787,13433,12291,20803,12759,852,13473,28958,17777,31305,6331,20262,23697,12409,21949,683,26272,30649,22007,27982,7427,18663,32671,10749,1603,19071,28949,26661,13419,9577,21099,1826,17074,7189,24613,1531,22106,6090,4925,6988,9944,8251,2667,2435,20789,29020,6307,847,31412,9075,7390,13398,1717,6514,1821,16935,25561,10628,11947,22895,13415,13286,23971,7023,21999,7160,13747,32685,3117,22420,21023,32234,21295,2206,19209,5205,7354,21724,32239,32254,31979,28680,16245,11661,2586,3108,23141,24628,29699,9230,32756,23778,5672,21588,3399,13242,2417,13897,18997,4547,30998,29017,1359,31969,16062,30361,12573,3076,2537,6818,26283,28575,5771,416,28996,24156,14073,4518,18302,14862,13577,24389,5495,230,20085,18524,15453,24299,20609,12593,27444,29604,5854,6081,13523,8215,29133,29013,18224,28920,14216,1622,10206,31002,1245,16482,6612,12329,28956,7839,4208,10651,14643,17488,21436,14308,9752,21926,14831,20457,12903,5848,6711,16568,13133,374,23733,4982,2212,17402,19401,10136,6239,24480,2705,24407,6441,22647,21676,28765,28745,11192,27460,11461,9929,87,21323,22594,14807,17881,18692,23966,19051,13669,3270,30823,28714,26909,27901,9957,13195,32175,12657,30798,29496,29222,19403,2877,14519,14855,29013,20577,16457,13721,513,25970,14354,1156,24749,7274,31355,26269,8357,753,18389,7937,11369,32281,17215,3425,18865,20043,14025,29084,7855,3970,25305,3475,7316,2486,23758,6457,29525,26012,16612,15593,29359,6540,15191,1533,31849,8898,11468,2460,27609,24266,28140,10707,5801,6454,30290,12519,19163,8594,27303,14058,28171,32154,22027,1421,8692,2986,4791,28213,4662,10613,9697,18001,20311,13050,4832,32234,23303,28084,27025,1147,18856,13329,5113,28676,7437,29990,10028,6746,15490,23713,15213,10433,11789,14079,3990,12732,29940,26111,31675,29988,14719,31062,30474,23160,7679,16292,13557,10612,25871,25511,7572,12517,19738,27054,9540,20411,17694,8529,18325,5216,24239,24416,10595,26184,8510,5145,9794,28106,8859,4510,19744,11822,2233,5798,4133,1543,22706,29042,11230,2499,14090,20227,2459,27776,32056,2698,8469,27425,18530,4384,7508,28065,25961,11703,18640,21160,15909,20816,1239,6492,11250,11119,20526,23930,21355,9932,8443,22949,28021,7756,5602,25598,8576,24111,17007,6388,21769,17803,6836,10334,5219,7161,16947,30919,30904,28558,16894,5384,12107,3853,27164,6173,1535,29786,25135,2865,8477,13106,11604,27131,15954,16410,9547,16717,10487,9109,12504,7146,17301,28058,14696,12697,19113,32069,9208,3191,13476,28877,20787,6289,21302,20918,26842,20914,6604,20808,29801,890,11608,10559,3320,20400,8528,29892,8287,28377,1529,5532,4509,24330,11237,31136,14459,29946,16570,21613,1132,859,10550,8540,18104,3179,15472,437,26585,12742,17505,19231,3109,22142,26530,23131,27566,10093,24695,32306,24935,32202,9485,3756,30088,20475,25856,1155,26419,9386,32,9431,31063,15387,23157,5411,1749,25533,12673,27504,8673,10239,22212,3785,17067,22628,29574,31726,18751,4570,14800,16973,22186,17224,9916,19757,16735,24678,14830,19757,10457,14033,18019,21997,27777,6495,16490,1035,2513,21935,11503,16209,9658,10245,5631,27948,17731,8533,10377,10080,31092,13214,24418,19195,626,22650,24460,29575,11755,1522,27064,13956,29876,26006,1289,13078,7089,462,18203,18938,23542,23915,23876,4542,22059,10625,15130,23346,21813,3449,4661,23066,9235,13666,30518,17957,31493,6792,22535,2083,18420,14920,10085,18290,22030,12066,24988,27577,6321,24592,20114,26329,7562,14870,9479,23329,27134,10267,29467,29122,18376,15607,28689,30082,17636,17357,6994,1460,27308,10907,19637,30055,28738,31503,6653,10974,27693,21917,13732,4928,18759,8910,10967,32401,726,28379,6849,30689,27641,9082,24332,28099,1606,5112,13733,16129,11185,3976,22976,32654,4015,28123,11805,2492,23452,18928,23689,12207,27226,24366,3751,8466,26428,15536,9200,22792,21538,17120,2297,10342,15077,8007,5108,12319,3573,15011,2682,24576,31808,19770,13448,19869,15446,3439,8391,30603,4811,11411,32272,18639,6109,5629,11823,28823,87,9309,30183,25128,28086,16717,28215,4376,2441,9001,6876,15805,28702,7457,18967,26085,11866,13708,8624,11719,22249,30335,32059,21818,29336,11423,410,3365,20478,2099,2499,16695,30306,21630,20676,10712,16345,14667,32004,14943,24239,15049,28875,16261,21000,27545,1028,16921,3527,1318,2882,502,22959,23093,20482,7475,11208,22461,24112,14233,517,2040,19180,13914,32547,19386,22669,25599,20180,15874,7142,4259,5405,30158,1737,607,27901,6708,31690,18949,14927,31919,20293,20497,21233,11703,22947,11740,17190,16276,32472,10003,12601,11123,20272,22376,9316,3258,9548,26759,13039,9881,25959,25676,23452,26593,16863,30515,3651,24858,10480,14096,10170,24784,16322,16896,25847,10797,3750,18847,4473,31181,17052,24187,29924,19661,10266,4041,17387,7717,17160,13143,6258,3640,10255,27074,13556,10410,31507,13033,5923,15474,14078,9889,7631,31280,8896,9643,17929,19648,6036,5859,17288,8207,31876,1209,30796,2605,6959,12005,3968,2724,12746,25687,16293,21513,26213,14701,30701,21456,32623,28265,31973,27748,1405,6690,14423,5496,12871,27898,16495,22167,20723,8207,23068,20483,29591,25782,31417,17852,8697,26661,3309,24799,26009,16239,31952,6961,22257,20406,20303,2300,4091,1691,18641,29978,10228,30458,26395,847,7264,11733,12912,19676,19278,21389,10749,11088,25309,27992,20341,9634,27135,21231,5625,13181,18045,11399,14394,19163,25659,3331,14817,27605,25022,31848,6191,7865,26091,1681,28128,6238,785,8740,3670,30900,19242,964,23539,22431,31070,12680,24007,5126,21705,27308,22635,6439,12414,14215,28204,3629,11468,13757,2668,9220,7616,29878,7238,30060,15082,30287,25713,11596,31844,10191,23143,26441,18705,26396,27846,32408,23075,26671,8438,16144,30688,3781,22028,11396,29605,4183,12014,21583,811,29261,26552,23856,24841,14447,6751,18777,22138,22428,13973,7874,4705,16574,12524,27075,29066,6141,11581,19938,7219,27699,10315,6378,7371,672,25764,3133,21497,2784,7880,20586,28128,20249,19597,18178,15522,13433,27586,11944,7202,8160,9235,19816,17167,4825,16428,5450,9502,5327,16930,30502,19094,15486,5902,22457,16658,28071,11771,23289,2434,7944,30210,31142,10100,15499,1971,5410,13714,31166,32183,32130,9067,10371,16564,7653,118,26633,19057,17156,30803,16378,9275,12299,25685,31734,9351,30120,5694,23361,12248,16225,16457,26808,227,2858,7790,3850,15345,32567,17633,15652,20870,21007,14300,12013,29760,30946,12446,11828,9729,4124,13236,24550,8273,12858,23671,29061,7165,12508,470,15061,15364,25628,6229,10201,8116,1055,30038,32509,24593,16617,22423,22421,31862,3190,22781,21638,31359,19206,11664,30531,15653,23992,21446,7932,22315,15194,6660,2066,23738,2944,7522,24525,30792,30675,9647,16465,18110,10156,693,10446,16089,6626,20157,17912,10192,20704,14934,7863,25400,1274,17747,31007,3621,20737,2323,2978,15763,3348,30725,20100,23044,19386,13930,400,24170,11566,28765,14858,32326,31994,20753,3300,30482,19911,32603,10548,4317,1908,17264,30438,4661,7013,14831,3502,11081,21278,14370,6209,7247,27920,17793,30661,6948,31666,20087,15238,15410,15060,29801,16618,25239,20273,7925,4007,31620,9283,12919,17971,2274,23643,4050,10877,16188,1776,16749,13018,15065,4407,31099,6978,4136,9461,17792,23228,15202,27026,6928,3351,13162,23406,8666,9435,9208,11640,24294,31103,4854,26876,9499,1500,29994,16316,28420,27362,30230,17475,1492,2698,30492,31862,6567,20235,2534,620,12042,29265,27141,10111,1470,22955,14808,19875,23737,22980,1712,27383,14190,30420,22577,27546,2126,29975,20220,26048,25743,19839,5771,21509,9516,23206,11867,18945,6445,20998,20049,22300,11560,23916,27223,2979,11272,26794,6470,21532,32013,30604,25352,7895,788,6158,14846,32710,281,17612,9119,18062,10234,19386,21602,15070,12669,3349,17118,29440,11413,9882,30256,30894,24289,24309,5022,12326,24438,25980,28538,13697,20190,14877,9544,9280,20576,20885,31523,32040,10370,18915,5212,7760,9421,17149,14181,376,12496,12225,10989,13468,15464,13102,28237,16585,22334,24020,20771,29488,9616,24457,11836,15481,4661,350,19896,6745,25051,31698,12904,16231,2964,32069,22139,27947,31377,29871,7002,13432,7468,29841,28880,4092,25900,16940,30574,3350,7493,25842,8750,30439,14303,19002,6998,14252,31513,20791,28831,25675,11788,21291,19095,9771,11092,31704,13124,30537,31949,1591,12298,25737,25754,12653,13006,19018,30572,507,9820,16188,11264,9013,6662,8566,1002,31989,20622,31171,12690,20880,13895,10557,24444,30729,630,5406,31948,1669,2046,17618,13065,255,31037,9809,26913,24637,9009,27819,30637,1283,25567,15588,29303,27526,24565,7427,11065,13091,15278,22886,20904,20049,23286,21592,21681,28373,27855,29670,26883,565,17907,8686,22733,21102,20154,4728,201,7913,2111,17481,7801,16812,27838,28598,21425,13518,12097,22455,853,3117,7804,12604,27492,14179,12021,5316,8245,8181,28776,11819,19713,30670,29289,7875,23970,19436,23627,17831,30106,12122,15425,25164,22615,4702,20931,17753,9910,6643,22323,953,5573,2937,3777,24558,717,8364,5772,23976,2192,22483,18441,13206,31183,5177,9897,3964,25871,8929,8630,24710,1437,30582,11646,7132,17872,13697,30644,12150,13966,23007,15123,5938,8209,6257,30276,18467,4075,16917,2562,26156,2120,18133,636,30670,13428,10335,4091,3135,18077,28853,29380,1980,25305,294,24128,2591,15211,19837,5978,9140,16962,22392,21033,19529,5058,32380,4815,20612,32455,30598,5537,10618,19943,357,648,29308,13816,10535,28582,28980,3538,13009,30525,25586,13142,31315,25805,2624,16816,24762,15741,7100,31960,6568,10172,8487,5727,27905,30248,25529,12136,16616,22959,26295,15349,32746,32500,8008,11108,12152,6900,24197,31289,19099,10985,8655,4381,13539,27503,15717,5415,22945,19173,5429,3419,19285,23318,22515,368,30570,1560,28777,30167,16929,2677,8462,26872,7884,649,32217,13759,30780,31531,14423,32599,32124,23952,29180,2613,9920,12395,2231,9817,1688,29785,4552,3792,15209,8061,30422,25214,5406,31847,26940,6682,17179,28731,8101,8058,7794,27663,4568,27153,25690,3476,9941,17590,29917,13049,2336,8358,27088,1548,5469,6605,6664,17059,5917,4161,23755,15418,18424,31504,8581,26333,17628,22587,12220,26441,28068,24066,9030,28238,25324,20834,30906,25463,5668,9693,15908,8941,8164,19065,15357,21145,20607,18443,10842,4745,11995,5301,18019,3221,22912,16558,23559,10050,32238,24641,6126,24550,23092,22297,13743,4109,31934,26811,24132,8732,13935,12884,19131,31028,29424,29109,32557,4185,27463,15772,12788,5332,26283,4917,13081,32725,32150,23776,26636,29533,4893,22069,12184,24155,30845,28997,16917,11286,28406,8483,25056,714,31708,11684,28680,21910,17131,29794,14666,19861,23259,15111,3904,20044,20532,30408,469,6468,19044,11567,19708,21751,1806,21022,20130,31473,8102,18193,6368,28975,19771,24483,29814,21195,7827,3924,26485,11227,21629,9353,5179,11414,22627,13524,1188,6072,287,7798,13695,28712,6671,17186,30271,10712,24684,24580,28915,25069,27351,9986,28281,25121,12085,32066,10990,29541,6845,748,20072,17354,28751,18481,24040,25505,24840,21388,14474,7649,4883,23879,29951,12234,2754,25666,13117,9160,10717,32752,13941};
    }
    public static void main(String[] args) {
        Solution8 solution8 = new Solution8();
        long start = System.nanoTime();
        int trap2 = solution8.trap2(height);
        long finish = System.nanoTime();
        long timeElapsed = finish - start;
        System.out.println(timeElapsed);
        System.out.println(trap2);

        start = System.nanoTime();
        int trap = solution8.trap(height);
        finish = System.nanoTime();
        timeElapsed = finish - start;
        System.out.println(timeElapsed);
        System.out.println(trap);
    }
}

