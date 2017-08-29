package com.techelevator;

public class AfternoonExercises {

	public static void main(String[] args) {
        
        /* 
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch? 
        */
		int initialBirds = 4;
		int flyAway = 1;
int birdsOnbranch = initialBirds - flyAway;
System.out.println(birdsOnbranch);
        /* 
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests? 
        */
int totalBirds = 6;
int nests = 3;
int extraBirds = totalBirds - nests;
System.out.println(extraBirds);
        /* 
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods? 
        */
int initRaccoons = 3;
int RaccoonsGone = 2;
int raccoonsInWoods = initRaccoons - RaccoonsGone;
System.out.println(raccoonsInWoods);
        /* 
        4. There are 5 flowers and 3 bees. How many less bees than flowers? 
        */
int flowers = 5;
int bees = 3;
int beesLessThanFlowers = flowers - bees;
System.out.println(beesLessThanFlowers);
        /* 
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now? 
        */
int pigeons =1;
pigeons ++;
System.out.println(pigeons);
        /* 
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now? 
        */
int initialOwls = 3;
int addOwls = 2;
int owls = initialOwls + addOwls;
System.out.println(owls);
        /* 
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home? 
        */
int beaversWork = 2;
beaversWork --;
System.out.println(beaversWork);
        /* 
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all? 
        */
int toucans = 2;
toucans ++;
System.out.println(toucans);
        /* 
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts? 
        */
int squirrels = 4;
int nuts = 2;
int squirrelsLessNuts = squirrels - nuts;
System.out.println(squirrelsLessNuts);
        /* 
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find? 
        */
double money = (25 + 10 + (2 * 5))/100.00;
System.out.println(money);
        /* 
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all? 
        */
int brierMuffins = 18;
int macAdamsMuffins = 20;
int flanneryMuffins = 17;
int firstGradeMuffins = brierMuffins + macAdamsMuffins + flanneryMuffins;
System.out.println(firstGradeMuffins);
        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
int yoyoPrice = 24;
int whistlePrice = 14;
        int centsOnToys = yoyoPrice + whistlePrice;
        System.out.println(centsOnToys);
        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
        int lgMarshmallows = 8;
        int miniMarshmallows = 10;
        int marshmallows = lgMarshmallows + miniMarshmallows;
        System.out.println(marshmallows);
        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
        int hiltSnowInches = 29;
        int schoolSnowInches = 17;
        int snowDiff = hiltSnowInches - schoolSnowInches;
        System.out.println(snowDiff);
        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
        int hiltDollars = 10;
        int truckPrice = 3;
        int pencilPrice = 2;
        int moneyLeft = hiltDollars - (truckPrice + pencilPrice);
        System.out.println(moneyLeft);
        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
        int initialMarbles = 16;
        int lostMarbles = 7;
        int currentMarbles = initialMarbles - lostMarbles;
        String Marbles = currentMarbles +" marbles";
        System.out.println(Marbles);
        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
        int initialShells = 19;
        int totalShells = 25;
        int shellsNeeded = totalShells - initialShells;
        System.out.println(shellsNeeded);
        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
        int totalBalloons = 17;
        int redBalloons = 8;
        int greenBalloons = totalBalloons - redBalloons;
        System.out.println(greenBalloons);
        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
        int initialBooks = 38;
        int addBooks = 10;
        int booksOnShelf = initialBooks + addBooks;
        System.out.println(booksOnShelf);
        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
        int legsPerBee = 6;
        int numOfBees = 8;
        int totalBeeLegs = legsPerBee * numOfBees;
        System.out.println(totalBeeLegs);
        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
        double coneCost = .99 * 2;
        String properConeCost = "$" + coneCost;
        System.out.println(properConeCost);
        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
        int borderRocks = 125;
        int currentRocks = 64;
        int rocks = borderRocks - currentRocks;
        System.out.println(rocks);
        
        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
        int marbleCollection = 38;
        int missingMarbles = 15;
        int hiltMarbles = marbleCollection - missingMarbles;
        System.out.println(hiltMarbles);
        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
        int totalDrive = 78;
        int loggedMiles = 32;
        int milesLeft = totalDrive - loggedMiles;
        System.out.println(milesLeft);
        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */
        int hours = 1;
        int minsMorn = 30;
        int minsAft = 45;
        int minsShoveling = (hours * 60) + minsMorn + minsAft;
        String MinsShovelingFinal = minsShoveling + " minutes";
        System.out.println(MinsShovelingFinal);
        /*    
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
        double hotDogCost = 6.00 * .50;
        String DollarHotDogCost = "$" + hotDogCost;
        System.out.println(DollarHotDogCost);
        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
        int currentBudgetCents = 50;
        int pencilCostCents = 7;
        int pencilsCanBuy = currentBudgetCents / pencilCostCents;
        System.out.println(pencilsCanBuy);
        /*    
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
        int totalButterflies = 33;
        int orangeButterflies = 20;
        int redButterflies = totalButterflies - orangeButterflies;
        System.out.println(redButterflies);
        /*    
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
        int paid = 100;
        int cost = 54;
        int change = paid - cost;
        String ChangeProper = change + " cents";
        System.out.println(ChangeProper);
        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
        int currentTrees = 13;
        int addTree = 12;
        int totalTree = currentTrees + addTree;
        System.out.println(totalTree);
        /*    
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
        int daysTillGram = 2;
        int hoursTillGram = daysTillGram * 24;
        System.out.println(hoursTillGram);
        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
        int cousins = 4;
        int gumPerCousin = 5;
        int totalGum = cousins * gumPerCousin;
        System.out.println(totalGum);
        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
        int availableDollars = 3;
        int candyBar = 1;
        int remainingDollars = availableDollars - candyBar;
        System.out.println(remainingDollars);
        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
        int boats = 5;
        int peoplePerBoat = 3;
        int peopleInLake = boats * peoplePerBoat;
        System.out.println(peopleInLake);
        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
        int initialLegos = 380;
        int lostLegos = 57;
        int remainingLegos = initialLegos - lostLegos;
        System.out.println(remainingLegos);
        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
        int bakedMuffins = 35;
        int neededMuffins = 83;
        int muffinsToBake = neededMuffins - bakedMuffins;
        System.out.println(muffinsToBake);
        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
        int willyCrayons = 1400;
        int lucyCrayons = 290;
        int diffCrayons = willyCrayons - lucyCrayons;
        System.out.println(diffCrayons);
        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
        int stickersPerPage = 10;
        int pagesOfStickers = 22;
        int totalStickers = stickersPerPage * pagesOfStickers;
        System.out.println(totalStickers);
        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
        int totalCupcakes = 96;
        int totalChildren = 8; 
        int cupcakesPerChild = totalCupcakes / totalChildren;
        System.out.println(cupcakesPerChild);
        
        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */
        int totalCookies = 47;
        int cookiesPerJar = 6;
        int extraCookies = totalCookies % cookiesPerJar;
        System.out.println(extraCookies);
        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */
        int totalCroissants = 59;
        int neighbors = 8;
        int extraCroissants = totalCroissants % neighbors;
        System.out.println(extraCroissants);
        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
        int cookiesPerTray = 12;
        int cookieBatch = 276;
        int traysNeeded = cookieBatch / cookiesPerTray;
        System.out.println(traysNeeded);
        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
        int totalPretzels = 480;
        int pretzelsPerServing = 12;
        int servings = totalPretzels / pretzelsPerServing;
        System.out.println(servings);
        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
        int lemonCupcakes = 53;
        int lemonCupcakesAtHome = 2;
        int cupcakesPerBox = 3;
        int boxesGiven = (lemonCupcakes - lemonCupcakesAtHome) / cupcakesPerBox;
        System.out.println(boxesGiven);
        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
        int totalCarrots = 74;
        int people = 12; 
        int carrotsLeftover = totalCarrots % people;
        System.out.println(carrotsLeftover);
        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
        int bears = 98;
        int bearsPerShelf = 7;
        int filledShelves = bears / bearsPerShelf;
        System.out.println(filledShelves);
        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
        int totalPics = 480;
        int picPerAlbum = 20;
        int totalAlbum= totalPics / picPerAlbum;
        System.out.println(totalAlbum);
        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
        int cards = 94;
        int box = 8;
        int totalBoxes = cards / box;
        int extraCards = cards % box;
        System.out.println(totalBoxes);
        System.out.println(extraCards);
        
        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
        int totalBooks = 210;
        int shelves = 10;
        int booksPerShelf = totalBooks / shelves;
        System.out.println(booksPerShelf);
        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
         int croissants = 17;
         int guests = 7;
         int croissantPerGuest = croissants / guests;
         System.out.println(croissantPerGuest);
	}

}
