//Programmer Henok G
//First Modified August, 2015
//Last Modified September, 2015

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;

public class Ahgurachen extends MIDlet implements CommandListener{

    List mainList;
    Image africa;
    Image algeria;
    Image angola;
    Image botswana;
    Image benin;
    Image burkinafaso;
    Image burundi;
    Image lesotho;
    Image capeverde;
    Image cameroon;
    Image centralafrica;
    Image chad;
    Image comoros;
    Image drcongo;
    Image rcongo;
    Image cotedvour;
    Image djibouti;
    Image egypt;
    Image equatorialguinea;
    Image eritrea;
    Image ethiopia;
    Image gabon;
    Image gambia;
    Image ghana;
    Image guinea;
    Image guineabissau;
    Image haiti;
    Image kenya;
    Image liberia;
    Image libya;
    Image madagascar;
    Image malawi;
    Image mali;
    Image mauritania;
    Image mauritious;
    Image moroco;
    Image mozambique;
    Image namibia;
    Image niger;
    Image nigeria;
    Image rwanda;
    Image saotomeandprincipe;
    Image senegal;
    Image seychelles;
    Image sierraleone;
    Image somalia;
    Image southafrica;
    Image sudan;
    Image swaziland;
    Image tanzania;
    Image togo;
    Image tunisia;
    Image uganda;
    Image zambia;
    Image zimbabwe;
    Image southsudan;
    Command okCommand;
    Command backCommand;
    Command exitCommand;    
    
    protected void formMaker(Image flag, String name,String capital, String currency, String language, String population, String rank, String area, String history){
        
        Form f = new Form(name);
        backCommand = new Command("ተመለስ", Command.BACK, 1);
        f.append(flag);
        f.append("\t"+name+"\n");
        f.append("ዋና ከተማ - "+capital+"\n");
        f.append("የገንዘብ መለኪያ - "+currency+"\n");
        f.append("ብሄራዊ ቋንቋ - "+language+"\n");
        f.append("የመሬት ስፋት - "+area+"\n");
        f.append("የህዝብ ብዛት - "+population+" (በጁላይ፣ 1፣ 2015)"+"\n");
        f.append("በህዝብ ብዛት ከአፍሪካ - "+rank+"\n\n");
        f.append(history);

        f.addCommand(backCommand);
        f.setCommandListener(this);
        Display.getDisplay(this).setCurrent(f);
    }

    protected void formForAboutAfrica(){

        Form fn = new Form("አፍሪካ");
        backCommand = new Command("ተመለስ", Command.BACK, 1);
        fn.append(africa);
        fn.append("\t"+InformationCenter.africaName+"\n");
        fn.append("መቀመጫ ፅህፈት ቤት - "+InformationCenter.africaCapital+"\n");
        fn.append("የመሬት ስፋት - "+InformationCenter.africaArea+"\n");
        fn.append("የህዝብ ብዛት - "+InformationCenter.africaPopulation+" (በጁላይ፣ 1፣ 2015)"+"\n");
        fn.append("ከአለም ሀጉራት በስፋት - "+InformationCenter.africaRank+"\n\n");
        fn.append(InformationCenter.africaHistory);

        fn.addCommand(backCommand);
        fn.setCommandListener(this);
        Display.getDisplay(this).setCurrent(fn);
    }
    
    protected void imageMaker(){
        try{
            africa = Image.createImage(InformationCenter.africaFlag);
            algeria = Image.createImage(InformationCenter.algeriaFlag);
            angola = Image.createImage(InformationCenter.angolaFlag);
            botswana = Image.createImage(InformationCenter.botswanaFlag);
            benin = Image.createImage(InformationCenter.beninFlag);
            burkinafaso = Image.createImage(InformationCenter.burkinafasoFlag);
            burundi = Image.createImage(InformationCenter.burundiFlag);
            lesotho = Image.createImage(InformationCenter.lesothoFlag);
            capeverde = Image.createImage(InformationCenter.capeverdeFlag);
            cameroon = Image.createImage(InformationCenter.cameroonFlag);
            centralafrica = Image.createImage(InformationCenter.centralafricaFlag);
            chad = Image.createImage(InformationCenter.chadFlag);
            comoros = Image.createImage(InformationCenter.comorosFlag);
            drcongo = Image.createImage(InformationCenter.drcongoFlag);
            rcongo = Image.createImage(InformationCenter.rcongoFlag);
            cotedvour = Image.createImage(InformationCenter.cotedvourFlag);
            djibouti = Image.createImage(InformationCenter.djiboutiFlag);
            egypt = Image.createImage(InformationCenter.egyptFlag);
            equatorialguinea = Image.createImage(InformationCenter.equatorialguineaFlag);
            eritrea = Image.createImage(InformationCenter.eritreaFlag);
            ethiopia = Image.createImage(InformationCenter.ethiopiaFlag);
            gabon = Image.createImage(InformationCenter.gabonFlag);
            gambia = Image.createImage(InformationCenter.gambiaFlag);
            ghana = Image.createImage(InformationCenter.ghanaFlag);
            guinea = Image.createImage(InformationCenter.guineaFlag);
            guineabissau = Image.createImage(InformationCenter.guineabissauFlag);
            haiti = Image.createImage(InformationCenter.haitiFlag);
            kenya = Image.createImage(InformationCenter.kenyaFlag);
            liberia = Image.createImage(InformationCenter.liberiaFlag);
            libya = Image.createImage(InformationCenter.libyaFlag);
            madagascar = Image.createImage(InformationCenter.madagascarFlag);
            malawi = Image.createImage(InformationCenter.malawiFlag);
            mali = Image.createImage(InformationCenter.maliFlag);
            mauritania = Image.createImage(InformationCenter.mauritaniaFlag);
            mauritious = Image.createImage(InformationCenter.mauritiousFlag);
            moroco = Image.createImage(InformationCenter.morocoFlag);
            mozambique = Image.createImage(InformationCenter.mozambiqueFlag);
            namibia = Image.createImage(InformationCenter.namibiaFlag);
            niger = Image.createImage(InformationCenter.nigerFlag);
            nigeria = Image.createImage(InformationCenter.nigeriaFlag);
            rwanda = Image.createImage(InformationCenter.rwandaFlag);
            saotomeandprincipe = Image.createImage(InformationCenter.saotomeandprincipeFlag);
            senegal = Image.createImage(InformationCenter.senegalFlag);
            seychelles = Image.createImage(InformationCenter.seychellesFlag);
            sierraleone = Image.createImage(InformationCenter.sierraleoneFlag);
            somalia = Image.createImage(InformationCenter.somaliaFlag);
            southafrica = Image.createImage(InformationCenter.southafricaFlag);
            sudan = Image.createImage(InformationCenter.sudanFlag);
            swaziland = Image.createImage(InformationCenter.swazilandFlag);
            tanzania = Image.createImage(InformationCenter.tanzaniaFlag);
            togo = Image.createImage(InformationCenter.togoFlag);
            tunisia = Image.createImage(InformationCenter.tunisiaFlag);
            uganda = Image.createImage(InformationCenter.ugandaFlag);
            zambia = Image.createImage(InformationCenter.zambiaFlag);
            zimbabwe = Image.createImage(InformationCenter.zimbabweFlag);
            southsudan = Image.createImage(InformationCenter.southsudanFlag);
        }
        catch(Exception e){System.out.println(e);}
    }

    public void startApp() {

        imageMaker();
        mainList = new List("አህጉራችን", List.IMPLICIT);
        exitCommand = new Command("ውጣ", Command.EXIT, 1);
        okCommand = new Command("እሺ", Command.OK, 1);
        
        mainList.append(" 0. "+InformationCenter.africaName, africa);
        mainList.append(" 1. "+InformationCenter.algeriaName, algeria);
        mainList.append(" 2. "+InformationCenter.angolaName, angola);
        mainList.append(" 3. "+InformationCenter.beninName, benin);
        mainList.append(" 4. "+InformationCenter.botswanaName, botswana);
        mainList.append(" 5. "+InformationCenter.burkinafasoName, burkinafaso);
        mainList.append(" 6. "+InformationCenter.burundiName, burundi);
        mainList.append(" 7. "+InformationCenter.cameroonName, cameroon);
        mainList.append(" 8. "+InformationCenter.capeverdeName, capeverde);
        mainList.append(" 9. "+InformationCenter.centralafricaName, centralafrica);
        mainList.append(" 10. "+InformationCenter.chadName, chad);
        mainList.append(" 11. "+InformationCenter.comorosName, comoros);
        mainList.append(" 12. "+InformationCenter.cotedvourName, cotedvour);
        mainList.append(" 13. "+InformationCenter.djiboutiName, djibouti);
        mainList.append(" 14. "+InformationCenter.drcongoName, drcongo);
        mainList.append(" 15. "+InformationCenter.egyptName, egypt);
        mainList.append(" 16. "+InformationCenter.equatorialguineaName, equatorialguinea);
        mainList.append(" 17. "+InformationCenter.eritreaName, eritrea);
        mainList.append(" 18. "+InformationCenter.ethiopiaName, ethiopia);
        mainList.append(" 29. "+InformationCenter.gabonName, gabon);
        mainList.append(" 20. "+InformationCenter.gambiaName, gambia);
        mainList.append(" 21. "+InformationCenter.ghanaName, ghana);
        mainList.append(" 22. "+InformationCenter.guineaName, guinea);
        mainList.append(" 23. "+InformationCenter.guineabissauName, guineabissau);
        mainList.append(" 24. "+InformationCenter.haitiName, haiti);
        mainList.append(" 25. "+InformationCenter.kenyaName, kenya);
        mainList.append(" 26. "+InformationCenter.lesothoName, lesotho);
        mainList.append(" 27. "+InformationCenter.liberiaName, liberia);
        mainList.append(" 28. "+InformationCenter.libyaName, libya);
        mainList.append(" 29. "+InformationCenter.madagascarName, madagascar);
        mainList.append(" 30. "+InformationCenter.malawiName, malawi);
        mainList.append(" 31. "+InformationCenter.maliName, mali);
        mainList.append(" 32. "+InformationCenter.mauritaniaName, mauritania);
        mainList.append(" 33. "+InformationCenter.mauritiousName, mauritious);
        mainList.append(" 34. "+InformationCenter.morocoName, moroco);
        mainList.append(" 35. "+InformationCenter.mozambiqueName, mozambique);
        mainList.append(" 36. "+InformationCenter.namibiaName, namibia);
        mainList.append(" 37. "+InformationCenter.nigerName, niger);
        mainList.append(" 38. "+InformationCenter.nigeriaName, nigeria);
        mainList.append(" 39. "+InformationCenter.rcongoName, rcongo);
        mainList.append(" 40. "+InformationCenter.rwandaName, rwanda);
        mainList.append(" 41. "+InformationCenter.saotomeandprincipeName, saotomeandprincipe);
        mainList.append(" 42. "+InformationCenter.senegalName, senegal);
        mainList.append(" 43. "+InformationCenter.seychellesName, seychelles);
        mainList.append(" 44. "+InformationCenter.sierraleoneName, sierraleone);
        mainList.append(" 45. "+InformationCenter.somaliaName, somalia);
        mainList.append(" 46. "+InformationCenter.southafricaName, southafrica);
        mainList.append(" 47. "+InformationCenter.sudanName, sudan);
        mainList.append(" 48. "+InformationCenter.swazilandName, swaziland);
        mainList.append(" 49. "+InformationCenter.tanzaniaName, tanzania);
        mainList.append(" 50. "+InformationCenter.togoName, togo);
        mainList.append(" 51. "+InformationCenter.tunisiaName, tunisia);
        mainList.append(" 52. "+InformationCenter.ugandaName, uganda);
        mainList.append(" 53. "+InformationCenter.zambiaName, zambia);
        mainList.append(" 54. "+InformationCenter.zimbabweName, zimbabwe);
        mainList.append(" 55. "+InformationCenter.southsudanName, southsudan);

        mainList.addCommand(exitCommand);
        mainList.addCommand(okCommand);
        mainList.setCommandListener(this);
        Display.getDisplay(this).setCurrent(mainList);
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }

    public void commandAction(Command c, Displayable d) {
        
        if (c==exitCommand){
            notifyDestroyed();
        }
        else if (c==backCommand){
            startApp();
        }
        else if (c==okCommand){
            int index = mainList.getSelectedIndex();

            if (index==0) {
                formForAboutAfrica();
            }
            if (index==1){
                formMaker(algeria, InformationCenter.algeriaName, InformationCenter.algeriaCapital, InformationCenter.algeriaCurrency, InformationCenter.algeriaLanguage, InformationCenter.algeriaPopulation, InformationCenter.algeriaRank, InformationCenter.algeriaArea, InformationCenter.algeriaHistory);
            }
            else if (index==2){
                formMaker(angola, InformationCenter.angolaName, InformationCenter.angolaCapital, InformationCenter.angolaCurrency, InformationCenter.angolaLanguage, InformationCenter.angolaPopulation, InformationCenter.angolaRank, InformationCenter.angolaArea, InformationCenter.angolaHistory);
            }
            else if (index==3){
                formMaker(benin, InformationCenter.beninName, InformationCenter.beninCapital, InformationCenter.beninCurrency, InformationCenter.beninLanguage, InformationCenter.beninPopulation, InformationCenter.beninRank, InformationCenter.beninArea, InformationCenter.beninHistory);
            }
            else if (index==4){
                formMaker(botswana, InformationCenter.botswanaName, InformationCenter.botswanaCapital, InformationCenter.botswanaCurrency, InformationCenter.botswanaLanguage, InformationCenter.botswanaPopulation, InformationCenter.botswanaRank, InformationCenter.botswanaArea, InformationCenter.botswanaHistory);
            }
            else if (index==5){
                formMaker(burkinafaso, InformationCenter.burkinafasoName, InformationCenter.burkinafasoCapital, InformationCenter.burkinafasoCurrency, InformationCenter.burkinafasoLanguage, InformationCenter.burkinafasoPopulation, InformationCenter.burkinafasoRank, InformationCenter.burkinafasoArea, InformationCenter.burkinafasoHistory);
            }
            else if (index==6){
                formMaker(burundi, InformationCenter.burundiName, InformationCenter.burundiCapital, InformationCenter.burundiCurrency, InformationCenter.burundiLanguage, InformationCenter.burundiPopulation, InformationCenter.burundiRank, InformationCenter.burundiArea, InformationCenter.burundiHistory);
            }
            else if (index==7){
                formMaker(cameroon, InformationCenter.cameroonName, InformationCenter.cameroonCapital, InformationCenter.cameroonCurrency, InformationCenter.cameroonLanguage, InformationCenter.cameroonPopulation, InformationCenter.cameroonRank, InformationCenter.cameroonArea, InformationCenter.cameroonHistory);
            }
            else if (index==8){
                formMaker(capeverde, InformationCenter.capeverdeName, InformationCenter.capeverdeCapital, InformationCenter.capeverdeCurrency, InformationCenter.capeverdeLanguage, InformationCenter.capeverdePopulation, InformationCenter.capeverdeRank, InformationCenter.capeverdeArea, InformationCenter.capeverdeHistory);
            }
            else if (index==9){
                formMaker(centralafrica, InformationCenter.centralafricaName, InformationCenter.centralafricaCapital, InformationCenter.centralafricaCurrency, InformationCenter.centralafricaLanguage, InformationCenter.centralafricaPopulation, InformationCenter.centralafricaRank, InformationCenter.centralafricaArea, InformationCenter.centralafricaHistory);
            }
            else if (index==10){
                formMaker(chad, InformationCenter.chadName, InformationCenter.chadCapital, InformationCenter.chadCurrency, InformationCenter.chadLanguage, InformationCenter.chadPopulation, InformationCenter.chadRank, InformationCenter.chadArea, InformationCenter.chadHistory);
            }
            else if (index==11){
                formMaker(comoros, InformationCenter.comorosName, InformationCenter.comorosCapital, InformationCenter.comorosCurrency, InformationCenter.comorosLanguage, InformationCenter.comorosPopulation, InformationCenter.comorosRank, InformationCenter.comorosArea, InformationCenter.comorosHistory);
            }
            else if (index==12){
                formMaker(cotedvour, InformationCenter.cotedvourName, InformationCenter.cotedvourCapital, InformationCenter.cotedvourCurrency, InformationCenter.cotedvourLanguage, InformationCenter.cotedvourPopulation, InformationCenter.cotedvourRank, InformationCenter.cotedvourArea, InformationCenter.cotedvourHistory);
            }
            else if (index==13){
                formMaker(djibouti, InformationCenter.djiboutiName, InformationCenter.djiboutiCapital, InformationCenter.djiboutiCurrency, InformationCenter.djiboutiLanguage, InformationCenter.djiboutiPopulation, InformationCenter.djiboutiRank, InformationCenter.djiboutiArea, InformationCenter.djiboutiHistory);
            }
            else if (index==14){
                formMaker(drcongo, InformationCenter.drcongoName, InformationCenter.drcongoCapital, InformationCenter.drcongoCurrency, InformationCenter.drcongoLanguage, InformationCenter.drcongoPopulation, InformationCenter.drcongoRank, InformationCenter.drcongoArea, InformationCenter.drcongoHistory);
            }
            else if (index==15){
                formMaker(egypt, InformationCenter.egyptName, InformationCenter.egyptCapital, InformationCenter.egyptCurrency, InformationCenter.egyptLanguage, InformationCenter.egyptPopulation, InformationCenter.egyptRank, InformationCenter.egyptArea, InformationCenter.egyptHistory);
            }
            else if (index==16){
                formMaker(equatorialguinea, InformationCenter.equatorialguineaName, InformationCenter.equatorialguineaCapital, InformationCenter.equatorialguineaCurrency, InformationCenter.equatorialguineaLanguage, InformationCenter.equatorialguineaPopulation, InformationCenter.equatorialguineaRank, InformationCenter.equatorialguineaArea, InformationCenter.equatorialguineaHistory);
            }
            else if (index==17){
                formMaker(eritrea, InformationCenter.eritreaName, InformationCenter.eritreaCapital, InformationCenter.eritreaCurrency, InformationCenter.eritreaLanguage, InformationCenter.eritreaPopulation, InformationCenter.eritreaRank, InformationCenter.eritreaArea, InformationCenter.eritreaHistory);
            }
            else if (index==18){
                formMaker(ethiopia, InformationCenter.ethiopiaName, InformationCenter.ethiopiaCapital, InformationCenter.ethiopiaCurrency, InformationCenter.ethiopiaLanguage, InformationCenter.ethiopiaPopulation, InformationCenter.ethiopiaRank, InformationCenter.ethiopiaArea, InformationCenter.ethiopiaHistory);
            }
            else if (index==19){
                formMaker(gabon, InformationCenter.gabonName, InformationCenter.gabonCapital, InformationCenter.gabonCurrency, InformationCenter.gabonLanguage, InformationCenter.gabonPopulation, InformationCenter.gabonRank, InformationCenter.gabonArea, InformationCenter.gabonHistory);
            }
            else if (index==20){
                formMaker(gambia, InformationCenter.gambiaName, InformationCenter.gambiaCapital, InformationCenter.gambiaCurrency, InformationCenter.gambiaLanguage, InformationCenter.gambiaPopulation, InformationCenter.gambiaRank, InformationCenter.gambiaArea, InformationCenter.gambiaHistory);
            }
            else if (index==21){
                formMaker(ghana, InformationCenter.ghanaName, InformationCenter.ghanaCapital, InformationCenter.ghanaCurrency, InformationCenter.ghanaLanguage, InformationCenter.ghanaPopulation, InformationCenter.ghanaRank, InformationCenter.ghanaArea, InformationCenter.ghanaHistory);
            }
            else if (index==22){
                formMaker(guinea, InformationCenter.guineaName, InformationCenter.guineaCapital, InformationCenter.guineaCurrency, InformationCenter.guineaLanguage, InformationCenter.guineaPopulation, InformationCenter.guineaRank, InformationCenter.guineaArea, InformationCenter.guineaHistory);
            }
            else if (index==23){
                formMaker(guineabissau, InformationCenter.guineabissauName, InformationCenter.guineabissauCapital, InformationCenter.guineabissauCurrency, InformationCenter.guineabissauLanguage, InformationCenter.guineabissauPopulation, InformationCenter.guineabissauRank, InformationCenter.guineabissauArea, InformationCenter.guineabissauHistory);
            }
            else if (index==24){
                formMaker(haiti, InformationCenter.haitiName, InformationCenter.haitiCapital, InformationCenter.haitiCurrency, InformationCenter.haitiLanguage, InformationCenter.haitiPopulation, InformationCenter.haitiRank, InformationCenter.haitiArea, InformationCenter.haitiHistory);
            }
            else if (index==25){
                formMaker(kenya, InformationCenter.kenyaName, InformationCenter.kenyaCapital, InformationCenter.kenyaCurrency, InformationCenter.kenyaLanguage, InformationCenter.kenyaPopulation, InformationCenter.kenyaRank, InformationCenter.kenyaArea, InformationCenter.kenyaHistory);
            }
            else if (index==26){
                formMaker(lesotho, InformationCenter.lesothoName, InformationCenter.lesothoCapital, InformationCenter.lesothoCurrency, InformationCenter.lesothoLanguage, InformationCenter.lesothoPopulation, InformationCenter.lesothoRank, InformationCenter.lesothoArea, InformationCenter.lesothoHistory);
            }
            else if (index==27){
                formMaker(liberia, InformationCenter.liberiaName, InformationCenter.liberiaCapital, InformationCenter.liberiaCurrency, InformationCenter.liberiaLanguage, InformationCenter.liberiaPopulation, InformationCenter.liberiaRank, InformationCenter.liberiaArea, InformationCenter.liberiaHistory);
            }
            else if (index==28){
                formMaker(libya, InformationCenter.libyaName, InformationCenter.libyaCapital, InformationCenter.libyaCurrency, InformationCenter.libyaLanguage, InformationCenter.libyaPopulation, InformationCenter.libyaRank, InformationCenter.libyaArea, InformationCenter.libyaHistory);
            }
            else if (index==29){
                formMaker(madagascar, InformationCenter.madagascarName, InformationCenter.madagascarCapital, InformationCenter.madagascarCurrency, InformationCenter.madagascarLanguage, InformationCenter.madagascarPopulation, InformationCenter.madagascarRank, InformationCenter.madagascarArea, InformationCenter.madagascarHistory);
            }
            else if (index==30){
                formMaker(malawi, InformationCenter.malawiName, InformationCenter.malawiCapital, InformationCenter.malawiCurrency, InformationCenter.malawiLanguage, InformationCenter.malawiPopulation, InformationCenter.malawiRank, InformationCenter.malawiArea, InformationCenter.malawiHistory);
            }
            else if (index==31){
                formMaker(mali, InformationCenter.maliName, InformationCenter.maliCapital, InformationCenter.maliCurrency, InformationCenter.maliLanguage, InformationCenter.maliPopulation, InformationCenter.maliRank, InformationCenter.maliArea, InformationCenter.maliHistory);
            }
            else if (index==32){
                formMaker(mauritania, InformationCenter.mauritaniaName, InformationCenter.mauritaniaCapital, InformationCenter.mauritaniaCurrency, InformationCenter.mauritaniaLanguage, InformationCenter.mauritaniaPopulation, InformationCenter.mauritaniaRank, InformationCenter.mauritaniaArea, InformationCenter.mauritaniaHistory);
            }
            else if (index==33){
                formMaker(mauritious, InformationCenter.mauritiousName, InformationCenter.mauritiousCapital, InformationCenter.mauritiousCurrency, InformationCenter.mauritiousLanguage, InformationCenter.mauritiousPopulation, InformationCenter.mauritiousRank, InformationCenter.mauritiousArea, InformationCenter.mauritiousHistory);
            }
            else if (index==34){
                formMaker(moroco, InformationCenter.morocoName, InformationCenter.morocoCapital, InformationCenter.morocoCurrency, InformationCenter.morocoLanguage, InformationCenter.morocoPopulation, InformationCenter.morocoRank, InformationCenter.morocoArea, InformationCenter.morocoHistory);
            }
            else if (index==35){
                formMaker(mozambique, InformationCenter.mozambiqueName, InformationCenter.mozambiqueCapital, InformationCenter.mozambiqueCurrency, InformationCenter.mozambiqueLanguage, InformationCenter.mozambiquePopulation, InformationCenter.mozambiqueRank, InformationCenter.mozambiqueArea, InformationCenter.mozambiqueHistory);
            }
            else if (index==36){
                formMaker(namibia, InformationCenter.namibiaName, InformationCenter.namibiaCapital, InformationCenter.namibiaCurrency, InformationCenter.namibiaLanguage, InformationCenter.namibiaPopulation, InformationCenter.namibiaRank, InformationCenter.namibiaArea, InformationCenter.namibiaHistory);
            }
            else if (index==37){
                formMaker(niger, InformationCenter.nigerName, InformationCenter.nigerCapital, InformationCenter.nigerCurrency, InformationCenter.nigerLanguage, InformationCenter.nigerPopulation, InformationCenter.nigerRank, InformationCenter.nigerArea, InformationCenter.nigerHistory);
            }
            else if (index==38){
                formMaker(nigeria, InformationCenter.nigeriaName, InformationCenter.nigeriaCapital, InformationCenter.nigeriaCurrency, InformationCenter.nigeriaLanguage, InformationCenter.nigeriaPopulation, InformationCenter.nigeriaRank, InformationCenter.nigeriaArea, InformationCenter.nigeriaHistory);
            }
            else if (index==39){
                formMaker(rcongo, InformationCenter.rcongoName, InformationCenter.rcongoCapital, InformationCenter.rcongoCurrency, InformationCenter.rcongoLanguage, InformationCenter.rcongoPopulation, InformationCenter.rcongoRank, InformationCenter.rcongoArea, InformationCenter.rcongoHistory);
            }
            else if (index==40){
                formMaker(rwanda, InformationCenter.rwandaName, InformationCenter.rwandaCapital, InformationCenter.rwandaCurrency, InformationCenter.rwandaLanguage, InformationCenter.rwandaPopulation, InformationCenter.rwandaRank, InformationCenter.rwandaArea, InformationCenter.rwandaHistory);
            }
            else if (index==41){
                formMaker(saotomeandprincipe, InformationCenter.saotomeandprincipeName, InformationCenter.saotomeandprincipeCapital, InformationCenter.saotomeandprincipeCurrency, InformationCenter.saotomeandprincipeLanguage, InformationCenter.saotomeandprincipePopulation, InformationCenter.saotomeandprincipeRank, InformationCenter.saotomeandprincipeArea, InformationCenter.saotomeandprincipeHistory);
            }
            else if (index==42){
                formMaker(senegal, InformationCenter.senegalName, InformationCenter.senegalCapital, InformationCenter.senegalCurrency, InformationCenter.senegalLanguage, InformationCenter.senegalPopulation, InformationCenter.senegalRank, InformationCenter.senegalArea, InformationCenter.senegalHistory);
            }
            else if (index==43){
                formMaker(seychelles, InformationCenter.seychellesName, InformationCenter.seychellesCapital, InformationCenter.seychellesCurrency, InformationCenter.seychellesLanguage, InformationCenter.seychellesPopulation, InformationCenter.seychellesRank, InformationCenter.seychellesArea, InformationCenter.seychellesHistory);
            }
            else if (index==44){
                formMaker(sierraleone, InformationCenter.sierraleoneName, InformationCenter.sierraleoneCapital, InformationCenter.sierraleoneCurrency, InformationCenter.sierraleoneLanguage, InformationCenter.sierraleonePopulation, InformationCenter.sierraleoneRank, InformationCenter.sierraleoneArea, InformationCenter.sierraleoneHistory);
            }
            else if (index==45){
                formMaker(somalia, InformationCenter.somaliaName, InformationCenter.somaliaCapital, InformationCenter.somaliaCurrency, InformationCenter.somaliaLanguage, InformationCenter.somaliaPopulation, InformationCenter.somaliaRank, InformationCenter.somaliaArea, InformationCenter.somaliaHistory);
            }
            else if (index==46){
                formMaker(southafrica, InformationCenter.southafricaName, InformationCenter.southafricaCapital, InformationCenter.southafricaCurrency, InformationCenter.southafricaLanguage, InformationCenter.southafricaPopulation, InformationCenter.southafricaRank, InformationCenter.southafricaArea, InformationCenter.southafricaHistory);
            }
            else if (index==47){
                formMaker(sudan, InformationCenter.sudanName, InformationCenter.sudanCapital, InformationCenter.sudanCurrency, InformationCenter.sudanLanguage, InformationCenter.sudanPopulation, InformationCenter.sudanRank, InformationCenter.sudanArea, InformationCenter.sudanHistory);
            }
            else if (index==48){
                formMaker(swaziland, InformationCenter.swazilandName, InformationCenter.swazilandCapital, InformationCenter.swazilandCurrency, InformationCenter.swazilandLanguage, InformationCenter.swazilandPopulation, InformationCenter.swazilandRank, InformationCenter.swazilandArea, InformationCenter.swazilandHistory);
            }
            else if (index==49){
                formMaker(tanzania, InformationCenter.tanzaniaName, InformationCenter.tanzaniaCapital, InformationCenter.tanzaniaCurrency, InformationCenter.tanzaniaLanguage, InformationCenter.tanzaniaPopulation, InformationCenter.tanzaniaRank, InformationCenter.tanzaniaArea, InformationCenter.tanzaniaHistory);
            }
            else if (index==50){
                formMaker(togo, InformationCenter.togoName, InformationCenter.togoCapital, InformationCenter.togoCurrency, InformationCenter.togoLanguage, InformationCenter.togoPopulation, InformationCenter.togoRank, InformationCenter.togoArea, InformationCenter.togoHistory);
            }
            else if (index==51){
                formMaker(tunisia, InformationCenter.tunisiaName, InformationCenter.tunisiaCapital, InformationCenter.tunisiaCurrency, InformationCenter.tunisiaLanguage, InformationCenter.tunisiaPopulation, InformationCenter.tunisiaRank, InformationCenter.tunisiaArea, InformationCenter.tunisiaHistory);
            }
            else if (index==52){
                formMaker(uganda, InformationCenter.ugandaName, InformationCenter.ugandaCapital, InformationCenter.ugandaCurrency, InformationCenter.ugandaLanguage, InformationCenter.ugandaPopulation, InformationCenter.ugandaRank, InformationCenter.ugandaArea, InformationCenter.ugandaHistory);
            }
            else if (index==53){
                formMaker(zambia, InformationCenter.zambiaName, InformationCenter.zambiaCapital, InformationCenter.zambiaCurrency, InformationCenter.zambiaLanguage, InformationCenter.zambiaPopulation, InformationCenter.zambiaRank, InformationCenter.zambiaArea, InformationCenter.zambiaHistory);
            }
            else if (index==54){
                formMaker(zimbabwe, InformationCenter.zimbabweName, InformationCenter.zimbabweCapital, InformationCenter.zimbabweCurrency, InformationCenter.zimbabweLanguage, InformationCenter.zimbabwePopulation, InformationCenter.zimbabweRank, InformationCenter.zimbabweArea, InformationCenter.zimbabweHistory);
            }
            else if (index==55){
                formMaker(southsudan, InformationCenter.southsudanName, InformationCenter.southsudanCapital, InformationCenter.southsudanCurrency, InformationCenter.southsudanLanguage, InformationCenter.southsudanPopulation, InformationCenter.southsudanRank, InformationCenter.southsudanArea, InformationCenter.southsudanHistory);
            }
        }
    }
}