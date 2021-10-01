

package com.example.apify;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView  amazon1,flipkart1,myntra1,paytm1,ajio1,ebay1,nykaa1,snapdeal1;
    private CardView  instagram1,twitter1,facebook1,youtube1,quora1,linkdin1,pinterest1;
    private CardView  prime1,spotify1,hotstar1,gaana1,sonyliv1,zee51,netflix1;
    private CardView  swiggy1,zomato1,kfc1,burgerking1,dominos1,mcdonalds1,pizzahut1;
    private CardView  paytmrecharge1,freecharge1,jio1,airtel1,bsnl1;//recharge
    private CardView  ndtv1,aajtak1,zeenewss1,toi1,tv91;//news
    private CardView  crickbuzz1,fifa1,football1,tennis1;//sports
    private CardView  maps1,translate1,medimg1,oyo1,dictionary1,aboutus1;//utility
    private CardView  amazon2,flipkart2,instagram2,prime2,zomato2,paytm2,toi2,crickbuzz2;//mostly used




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //mostly used app
        amazon2= (CardView) findViewById(R.id.amazonmostlycard);
        flipkart2= (CardView) findViewById(R.id.flipkartmostlycard);
        instagram2= (CardView) findViewById(R.id.instagrammostlycard);
        prime2= (CardView) findViewById(R.id.primemostlycard);
        zomato2= (CardView) findViewById(R.id.zomatomostlycard);
        paytm2= (CardView) findViewById(R.id.paytmmostlycard);
        toi2= (CardView) findViewById(R.id.toimostlycard);
        crickbuzz2= (CardView) findViewById(R.id.cricbuzzmostlycard);

//shopping
        amazon1= (CardView) findViewById(R.id.amazoncard);
        flipkart1= (CardView) findViewById(R.id.flipkartcard);
        myntra1= (CardView) findViewById(R.id.myntracard);
        paytm1= (CardView) findViewById(R.id.paytmmallcard);
        ajio1= (CardView) findViewById(R.id.ajiocard);
        ebay1= (CardView) findViewById(R.id.ebaycard);
        nykaa1= (CardView) findViewById(R.id.nykaacard);
        snapdeal1= (CardView) findViewById(R.id.snapdealcard);

//social media
        instagram1= (CardView) findViewById(R.id.instagramcard);
        twitter1= (CardView) findViewById(R.id.twittercard);
        facebook1= (CardView) findViewById(R.id.facebookcard);
        youtube1= (CardView) findViewById(R.id.youtubecard);
        quora1= (CardView) findViewById(R.id.quoracard);
        linkdin1= (CardView) findViewById(R.id.linkdincard);
        pinterest1= (CardView) findViewById(R.id.pinterestcard);


//social media
        prime1= (CardView) findViewById(R.id.primecard);
        spotify1= (CardView) findViewById(R.id.spotifycard);
        hotstar1= (CardView) findViewById(R.id.hotstarcard);
        gaana1= (CardView) findViewById(R.id.gaanacard);
        sonyliv1= (CardView) findViewById(R.id.sonylivcard);
        zee51= (CardView) findViewById(R.id.zee5card);
        netflix1= (CardView) findViewById(R.id.netflixcard);

//food
        swiggy1= (CardView) findViewById(R.id.swiggycard);
        zomato1= (CardView) findViewById(R.id.zomatocard);
        kfc1= (CardView) findViewById(R.id.kfccard);
        burgerking1= (CardView) findViewById(R.id.burgerkingcard);
        dominos1= (CardView) findViewById(R.id.dominoscard);
        mcdonalds1= (CardView) findViewById(R.id.mcdonaldscard);
        pizzahut1= (CardView) findViewById(R.id.pizzahutcard);

        //recharge
        paytm1= (CardView) findViewById(R.id.paytmrechargecard);
        freecharge1= (CardView) findViewById(R.id.freechargecard);
        jio1= (CardView) findViewById(R.id.jiocard);
        airtel1= (CardView) findViewById(R.id.airtelcard);
        bsnl1= (CardView) findViewById(R.id.bsnlcard);

        //news
        ndtv1= (CardView) findViewById(R.id.ndtvcard);
        aajtak1= (CardView) findViewById(R.id.aajtakcard);
        zeenewss1= (CardView) findViewById(R.id.zeenewscard);
        toi1= (CardView) findViewById(R.id.toicard);
        tv91= (CardView) findViewById(R.id.tv9card);


        //sports
        crickbuzz1= (CardView) findViewById(R.id.crickbuzzcard);
        fifa1= (CardView) findViewById(R.id.fifacard);
        football1= (CardView) findViewById(R.id.footballcard);
        tennis1= (CardView) findViewById(R.id.tenniscard);


        //utility
        maps1= (CardView) findViewById(R.id.mapscard);
        translate1= (CardView) findViewById(R.id.translatecard);
        medimg1= (CardView) findViewById(R.id.medimgcard);
        oyo1= (CardView) findViewById(R.id.oyocard);
        dictionary1= (CardView) findViewById(R.id.dictionarycard);
        aboutus1= (CardView) findViewById(R.id.aboutuscard);









        amazon2.setOnClickListener(this);
        flipkart2.setOnClickListener(this);
        instagram2.setOnClickListener(this);
        prime2.setOnClickListener(this);
        zomato2.setOnClickListener(this);
        paytm2.setOnClickListener(this);
        toi2.setOnClickListener(this);
        crickbuzz2.setOnClickListener(this);

        amazon1.setOnClickListener(this);
        flipkart1.setOnClickListener(this);
        myntra1.setOnClickListener(this);
        paytm1.setOnClickListener(this);
        ajio1.setOnClickListener(this);
        ebay1.setOnClickListener(this);
        nykaa1.setOnClickListener(this);
        snapdeal1.setOnClickListener(this);


        instagram1.setOnClickListener(this);
        twitter1.setOnClickListener(this);
        facebook1.setOnClickListener(this);
        youtube1.setOnClickListener(this);
        quora1.setOnClickListener(this);
        linkdin1.setOnClickListener(this);
        pinterest1.setOnClickListener(this);


        prime1.setOnClickListener(this);
        spotify1.setOnClickListener(this);
        hotstar1.setOnClickListener(this);
        gaana1.setOnClickListener(this);
        sonyliv1.setOnClickListener(this);
        zee51.setOnClickListener(this);
        netflix1.setOnClickListener(this);


        swiggy1.setOnClickListener(this);
        zomato1.setOnClickListener(this);
        kfc1.setOnClickListener(this);
        burgerking1.setOnClickListener(this);
        dominos1.setOnClickListener(this);
        mcdonalds1.setOnClickListener(this);
        pizzahut1.setOnClickListener(this);


        paytm1.setOnClickListener(this);
        freecharge1.setOnClickListener(this);
        jio1.setOnClickListener(this);
        airtel1.setOnClickListener(this);
        bsnl1.setOnClickListener(this);

        //news
        ndtv1.setOnClickListener(this);
        aajtak1.setOnClickListener(this);
        zeenewss1.setOnClickListener(this);
        toi1.setOnClickListener(this);
        tv91.setOnClickListener(this);


        //sports
        crickbuzz1.setOnClickListener(this);
        fifa1.setOnClickListener(this);
        football1.setOnClickListener(this);
        tennis1.setOnClickListener(this);


        //utility
        maps1.setOnClickListener(this);
        translate1.setOnClickListener(this);
        medimg1.setOnClickListener(this);
        oyo1.setOnClickListener(this);
        dictionary1.setOnClickListener(this);
        aboutus1.setOnClickListener(this);





    }

    @Override
    public void onClick(View view) {
        Intent i;

        switch(view.getId()){


            //shopping page
            case R.id.amazoncard:

            case R.id.amazonmostlycard:
                i= new Intent(this,amazon.class);
                startActivity(i);
                break;

            case R.id.flipkartcard:

            case R.id.flipkartmostlycard:
                i= new Intent(this,flipkart.class);
                startActivity(i);
                break;

            case R.id.myntracard:
                i= new Intent(this,myntra.class);
                startActivity(i);
                break;

            case R.id.paytmmallcard:
                i= new Intent(this,paytm.class);
                startActivity(i);
                break;

            case R.id.ajiocard:
                i= new Intent(this,ajio.class);
                startActivity(i);
                break;

            case R.id.ebaycard:
                i= new Intent(this,ebay.class);
                startActivity(i);
                break;

            case R.id.nykaacard:
                i= new Intent(this,nykaa.class);
                startActivity(i);
                break;

            case R.id.snapdealcard:
                i= new Intent(this,snapdeal.class);
                startActivity(i);
                break;

                //social page
            case R.id.instagramcard:
                i= new Intent(this,instagram.class);
                startActivity(i);
                break;

            case R.id.twittercard:
                i= new Intent(this,twitter.class);
                startActivity(i);
                break;

            case R.id.facebookcard:
                i= new Intent(this,facebook.class);
                startActivity(i);
                break;

            case R.id.youtubecard:
                i= new Intent(this,youtube1.class);
                startActivity(i);
                break;

            case R.id.quoracard:
                i= new Intent(this,quora.class);
                startActivity(i);
                break;

            case R.id.linkdincard:
                i= new Intent(this,linkdin.class);
                startActivity(i);
                break;

            case R.id.pinterestcard:
                i= new Intent(this,pinterest.class);
                startActivity(i);
                break;

                // entertainment

            case R.id.primecard:
                i= new Intent(this,prime.class);
                startActivity(i);
                break;

            case R.id.spotifycard:
                i= new Intent(this,spotify.class);
                startActivity(i);
                break;

            case R.id.hotstarcard:
                i= new Intent(this,hotstar.class);
                startActivity(i);
                break;

            case R.id.gaanacard:
                i= new Intent(this,gaana.class);
                startActivity(i);
                break;

            case R.id.sonylivcard:
                i= new Intent(this,sonyliv.class);
                startActivity(i);
                break;

            case R.id.zee5card:
                i= new Intent(this,zee5.class);
                startActivity(i);
                break;

            case R.id.netflixcard:
                i= new Intent(this,netflix.class);
                startActivity(i);
                break;



                //food
            case R.id.swiggycard:
                i= new Intent(this,swiggy.class);
                startActivity(i);
                break;

            case R.id.zomatocard:
                i= new Intent(this,zomato.class);
                startActivity(i);
                break;

            case R.id.kfccard:
                i= new Intent(this,kfc.class);
                startActivity(i);
                break;

            case R.id.burgerkingcard:
                i= new Intent(this,burgerking.class);
                startActivity(i);
                break;

            case R.id.dominoscard:
                i= new Intent(this,dominos.class);
                startActivity(i);
                break;

            case R.id.mcdonaldscard:
                i= new Intent(this,mcdonalds.class);
                startActivity(i);
                break;

            case R.id.pizzahutcard:
                i= new Intent(this,pizza.class);
                startActivity(i);
                break;

                //recharge

            case R.id.paytmrechargecard:card:
                i= new Intent(this,paytm.class);
                startActivity(i);
                break;

            case R.id.freechargecard:
                i= new Intent(this,frreecharge.class);
                startActivity(i);
                break;

            case R.id.jiocard:
                i= new Intent(this,jio.class);
                startActivity(i);
                break;

            case R.id.airtelcard:
                i= new Intent(this,airtel.class);
                startActivity(i);
                break;

            case R.id.bsnlcard:
                i= new Intent(this,bsnl.class);
                startActivity(i);
                break;


                //news


            case R.id.ndtvcard:
            i= new Intent(this,ndtv.class);
                startActivity(i);
                break;

            case R.id.aajtakcard:
                i= new Intent(this,aajtak.class);
                startActivity(i);
                break;

            case R.id.zeenewscard:
                i= new Intent(this,Zeenews.class);
                startActivity(i);
                break;

            case R.id.toicard:
                i= new Intent(this,toi.class);
                startActivity(i);
                break;

            case R.id.tv9card:
                i= new Intent(this,tv9.class);
                startActivity(i);
                break;

                //sports

            case R.id.crickbuzzcard:
                i= new Intent(this,crickbuzz.class);
                startActivity(i);
                break;

            case R.id.fifacard:
                i= new Intent(this,fifa.class);
                startActivity(i);
                break;

            case R.id.footballcard:
                i= new Intent(this,football.class);
                startActivity(i);
                break;

            case R.id.tenniscard:
                i= new Intent(this,tennis.class);
                startActivity(i);
                break;

                //utility

            case R.id.mapscard:
                i= new Intent(this,maps.class);
                startActivity(i);
                break;

            case R.id.translatecard:
                i= new Intent(this,translate.class);
                startActivity(i);
                break;

            case R.id.medimgcard:
                i= new Intent(this,medimg.class);
                startActivity(i);
                break;

            case R.id.oyocard:
                i= new Intent(this,oyo.class);
                startActivity(i);
                break;


            case R.id.dictionarycard:
                i= new Intent(this,dictionary.class);
                startActivity(i);
                break;

            case R.id.aboutuscard:
                i= new Intent(this,aboutus.class);
                startActivity(i);
                break;


            case R.id.instagrammostlycard:
                i= new Intent(this,instagram.class);
                startActivity(i);
                break;

            case R.id.primemostlycard:
                i= new Intent(this,prime.class);
                startActivity(i);
                break;

            case R.id.zomatomostlycard:
                i= new Intent(this,zomato.class);
                startActivity(i);
                break;

            case R.id.paytmmostlycard:
                i= new Intent(this,paytm.class);
                startActivity(i);
                break;

            case R.id.toimostlycard:
                i= new Intent(this,toi.class);
                startActivity(i);
                break;

            case R.id.cricbuzzmostlycard:
                i= new Intent(this,crickbuzz.class);
                startActivity(i);
                break;









        }




    }
}