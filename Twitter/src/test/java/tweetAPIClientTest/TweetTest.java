package tweetAPIClientTest;

import io.restassured.response.ValidatableResponse;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import tweet.TweetAPIClient;

import java.util.UUID;

public class TweetTest {

    private TweetAPIClient tweetAPIClient;
    ValidatableResponse response;

    @BeforeClass
    public void setUpTweetAPI() {

        this.tweetAPIClient = new TweetAPIClient();
    }
    //tweets creation

    @Test
    public void TestCreateTweet() {
        //String tweet="We are learning RestAPI Automation"+ UUID.randomUUID().toString();
        String tweet = "Practice again again" + UUID.randomUUID().toString();
        response = this.tweetAPIClient.createTweet(tweet);
        //Verify that tweet was successful
        response.statusCode(200);
        //int actualStatusCode=response.statusCode()
        String actualTweet = response.extract().body().path("text");
        Assert.assertEquals(actualTweet, tweet, "Test Failed");
        System.out.println(tweet);
        System.out.println(actualTweet);
    }

    @Test
    public void TestCreateTweet1() {
        //String tweet="We are learning RestAPI Automation"+ UUID.randomUUID().toString();
        String tweet = "tomorrow is a boot camp day" + UUID.randomUUID().toString();
        response = this.tweetAPIClient.createTweet(tweet);
        //Verify that tweet was successful
        response.statusCode(200);
        //int actualStatusCode=response.statusCode()
        String actualTweet = response.extract().body().path("text");
        Assert.assertEquals(actualTweet, tweet, "Test Failed");
        System.out.println(tweet);
        System.out.println(actualTweet);
    }

    @Test
    public void TestCreateTweet2() {
        //String tweet="We are learning RestAPI Automation"+ UUID.randomUUID().toString();
        String tweet = "the election day is november 3rd" + UUID.randomUUID().toString();
        response = this.tweetAPIClient.createTweet(tweet);
        //Verify that tweet was successful
        response.statusCode(200);
        //int actualStatusCode=response.statusCode()
        String actualTweet = response.extract().body().path("text");
        Assert.assertEquals(actualTweet, tweet, "Test Failed");
        System.out.println(tweet);
        System.out.println(actualTweet);
    }

    @Test
    public void TestCreateTweet3() {
        //String tweet="We are learning RestAPI Automation"+ UUID.randomUUID().toString();
        String tweet = "Zidane is one of the best soccer players is history" + UUID.randomUUID().toString();
        response = this.tweetAPIClient.createTweet(tweet);
        //Verify that tweet was successful
        response.statusCode(200);
        //int actualStatusCode=response.statusCode()
        String actualTweet = response.extract().body().path("text");
        Assert.assertEquals(actualTweet, tweet, "Test Failed");
        System.out.println(tweet);
        System.out.println(actualTweet);
    }

    @Test
    public void TestCreateTweet4() {
        //String tweet="We are learning RestAPI Automation"+ UUID.randomUUID().toString();
        String tweet = "the starts are winning against the lightning 3-2" + UUID.randomUUID().toString();
        response = this.tweetAPIClient.createTweet(tweet);
        //Verify that tweet was successful
        response.statusCode(200);
        //int actualStatusCode=response.statusCode()
        String actualTweet = response.extract().body().path("text");
        Assert.assertEquals(actualTweet, tweet, "Test Failed");
        System.out.println(tweet);
        System.out.println(actualTweet);
    }

    @Test
    public void TestCreateTweet5() {
        //String tweet="We are learning RestAPI Automation"+ UUID.randomUUID().toString();
        String tweet = "summer is over but the temperatures still a little high" + UUID.randomUUID().toString();
        response = this.tweetAPIClient.createTweet(tweet);
        //Verify that tweet was successful
        response.statusCode(200);
        //int actualStatusCode=response.statusCode()
        String actualTweet = response.extract().body().path("text");
        Assert.assertEquals(actualTweet, tweet, "Test Failed");
        System.out.println(tweet);
        System.out.println(actualTweet);
    }

    @Test
    public void TestCreateTweet6() {
        //String tweet="We are learning RestAPI Automation"+ UUID.randomUUID().toString();
        String tweet = "covid19 has changed the world" + UUID.randomUUID().toString();
        response = this.tweetAPIClient.createTweet(tweet);
        //Verify that tweet was successful
        response.statusCode(200);
        //int actualStatusCode=response.statusCode()
        String actualTweet = response.extract().body().path("text");
        Assert.assertEquals(actualTweet, tweet, "Test Failed");
        System.out.println(tweet);
        System.out.println(actualTweet);
    }

    @Test
    public void TestCreateTweet7() {
        //String tweet="We are learning RestAPI Automation"+ UUID.randomUUID().toString();
        String tweet = "the total deaths from the covid19 has surpassed 200,000" + UUID.randomUUID().toString();
        response = this.tweetAPIClient.createTweet(tweet);
        //Verify that tweet was successful
        response.statusCode(200);
        //int actualStatusCode=response.statusCode()
        String actualTweet = response.extract().body().path("text");
        Assert.assertEquals(actualTweet, tweet, "Test Failed");
        System.out.println(tweet);
        System.out.println(actualTweet);
    }

    @Test
    public void TestCreateTweet8() {
        //String tweet="We are learning RestAPI Automation"+ UUID.randomUUID().toString();
        String tweet = "masks and hand sanitizer become essential items to have in your backpack" + UUID.randomUUID().toString();
        response = this.tweetAPIClient.createTweet(tweet);
        //Verify that tweet was successful
        response.statusCode(200);
        //int actualStatusCode=response.statusCode()
        String actualTweet = response.extract().body().path("text");
        Assert.assertEquals(actualTweet, tweet, "Test Failed");
        System.out.println(tweet);
        System.out.println(actualTweet);
    }

    @Test
    public void TestCreateTweet9() {
        //String tweet="We are learning RestAPI Automation"+ UUID.randomUUID().toString();
        String tweet = "make sure you wash your hands very often, and every time you touch something" + UUID.randomUUID().toString();
        response = this.tweetAPIClient.createTweet(tweet);
        //Verify that tweet was successful
        response.statusCode(200);
        //int actualStatusCode=response.statusCode()
        String actualTweet = response.extract().body().path("text");
        Assert.assertEquals(actualTweet, tweet, "Test Failed");
        System.out.println(tweet);
        System.out.println(actualTweet);
    }


    //reply to a tweet

    @Test
    public void TestReplyTweet() {
        String replyTweet = "yes wash your hands as much as your can" + UUID.randomUUID().toString();
        response = this.tweetAPIClient.replyTweet(replyTweet);
        response.statusCode(200);

    }

    @Test
    public void TestReplyTweet1() {
        String replyTweet = "yes absolutely " + UUID.randomUUID().toString();
        response = this.tweetAPIClient.replyTweet(replyTweet);
        response.statusCode(200);
    }

    @Test
    public void TestReplyTweet2() {
        String replyTweet = "this is scary for real" + UUID.randomUUID().toString();
        response = this.tweetAPIClient.replyTweet(replyTweet);
        response.statusCode(200);
    }

    @Test
    public void TestReplyTweet3() {
        String replyTweet = "yes the world has changed" + UUID.randomUUID().toString();
        response = this.tweetAPIClient.replyTweet(replyTweet);
        response.statusCode(200);
    }

    @Test
    public void TestReplyTweet4() {
        String replyTweet = "i am gonna miss the beach and riding my bike" + UUID.randomUUID().toString();
        response = this.tweetAPIClient.replyTweet(replyTweet);
        response.statusCode(200);
    }

    @Test
    public void TestReplyTweet5() {
        String replyTweet = "just wait till the end, the canadians are coming back" + UUID.randomUUID().toString();
        response = this.tweetAPIClient.replyTweet(replyTweet);
        response.statusCode(200);
    }

    @Test
    public void TestReplyTweet6() {
        String replyTweet = "oh yes i agree" + UUID.randomUUID().toString();
        response = this.tweetAPIClient.replyTweet(replyTweet);
        response.statusCode(200);
    }

    @Test
    public void TestReplyTweet7() {
        String replyTweet = "yes in less than 2 months" + UUID.randomUUID().toString();
        response = this.tweetAPIClient.replyTweet(replyTweet);
        response.statusCode(200);
    }

    @Test
    public void TestReplyTweet8() {
        String replyTweet = "i need some sleep ia m tired" + UUID.randomUUID().toString();
        response = this.tweetAPIClient.replyTweet(replyTweet);
        response.statusCode(200);
    }

    @Test
    public void TestReplyTweet9() {
        String replyTweet = "yes in less than 2 months" + UUID.randomUUID().toString();
        response = this.tweetAPIClient.replyTweet(replyTweet);
        response.statusCode(200);
    }

    @Test
    public void TestReplyTweet10() {
        String replyTweet = "very interesting topic for the QA" + UUID.randomUUID().toString();
        response = this.tweetAPIClient.replyTweet(replyTweet);
        response.statusCode(200);
    }


    @Test
    public void TestReTweet() {
//        String replyTweet="We are Learning Reply Tweet"+UUID.randomUUID().toString();
        response = this.tweetAPIClient.reTweet();
        response.statusCode(200);

    }

    @Test
    public void testDelete() {
        String tweet = "just wait till the end, the canadians are coming backd625b33c-6465-44a5-ad2c-9b716a3f9e17";
        ValidatableResponse response = this.tweetAPIClient.deleteTweet(1309901855380692992l);
// Verify that the tweet was successfully deleted
        response.statusCode(200);
        String actualTweet = response.extract().body().path("text");
        org.junit.Assert.assertEquals(tweet, actualTweet);
    }
    //get tweets

    @Test
    public void testGetTweet() {
        String tweet = "yes in less than 2 monthsab00941f-0866-45ec-a740-11bfe8d72cb2";
        ValidatableResponse response = this.tweetAPIClient.getTweet(1309901859935657984l);
// Verify that the tweet was successfully deleted
        response.statusCode(200);
        String actualTweet = response.extract().body().path("text");
        org.junit.Assert.assertEquals(tweet, actualTweet);
        System.out.println(actualTweet);
        System.out.println(tweet);
    }

    @Test
    public void testGetTweet1() {
        String tweet = "i am gonna miss the beach and riding my bike166bb061-38b2-4cc5-b966-d142ebcfffe4";
        ValidatableResponse response = this.tweetAPIClient.getTweet(1309901854097235980l);
// Verify that the tweet was successfully deleted
        response.statusCode(200);
        String actualTweet = response.extract().body().path("text");
        org.junit.Assert.assertEquals(tweet, actualTweet);
        System.out.println(actualTweet);
        System.out.println(tweet);
    }

    @Test
    public void testGetTweet2() {
        String tweet = "yes the world has changed50bb0758-fbd6-45a8-b14e-fd9efe9f4455";
        ValidatableResponse response = this.tweetAPIClient.getTweet(1309901853010911234l);
// Verify that the tweet was successfully deleted
        response.statusCode(200);
        String actualTweet = response.extract().body().path("text");
        org.junit.Assert.assertEquals(tweet, actualTweet);
        System.out.println(actualTweet);
        System.out.println(tweet);
    }

    @Test
    public void testGetTweet3() {
        String tweet = "this is scary for real9b8715fb-7347-4726-b69c-7ee24db0090d";
        ValidatableResponse response = this.tweetAPIClient.getTweet(1309901851823927301l);
// Verify that the tweet was successfully deleted
        response.statusCode(200);
        String actualTweet = response.extract().body().path("text");
        org.junit.Assert.assertEquals(tweet, actualTweet);
        System.out.println(actualTweet);
        System.out.println(tweet);
    }

    @Test
    public void testGetTweet4() {
        String tweet = "Welcome friends to my mentoring1";
        ValidatableResponse response = this.tweetAPIClient.getTweet(1306370696650665984l);
// Verify that the tweet was successfully deleted
        response.statusCode(200);
        String actualTweet = response.extract().body().path("text");
        org.junit.Assert.assertEquals(tweet, actualTweet);
        System.out.println(actualTweet);
        System.out.println(tweet);
    }

    @Test
    public void testGetTweet5() {
        String tweet = "i am gonna miss the beach and riding my bike335f6845-a0ee-4678-bede-de40330821b6";
        ValidatableResponse response = this.tweetAPIClient.getTweet(1309678467030675459l);
// Verify that the tweet was successfully deleted
        response.statusCode(200);
        String actualTweet = response.extract().body().path("text");
        org.junit.Assert.assertEquals(tweet, actualTweet);
        System.out.println(actualTweet);
        System.out.println(tweet);
    }

    @Test
    public void testGetTweet6() {
        String tweet = "yes the world has changed332bc337-55d8-43af-8812-608da466fce2";
        ValidatableResponse response = this.tweetAPIClient.getTweet(1309677970186014720l);
// Verify that the tweet was successfully deleted
        response.statusCode(200);
        String actualTweet = response.extract().body().path("text");
        org.junit.Assert.assertEquals(tweet, actualTweet);
        System.out.println(actualTweet);
        System.out.println(tweet);
    }

    @Test
    public void testGetTweet7() {
        String tweet = "make sure you wash your hands very often, and every time you touch something4f773695-1c22-4813-bff0-e56cd67a77cf";
        ValidatableResponse response = this.tweetAPIClient.getTweet(1309901846874648584l);
// Verify that the tweet was successfully deleted
        response.statusCode(200);
        String actualTweet = response.extract().body().path("text");
        org.junit.Assert.assertEquals(tweet, actualTweet);
        System.out.println(actualTweet);
        System.out.println(tweet);
    }

    //    @Test
//    public void testGetTweet8(){
//        String tweet="yes wash your hands as much as your can7cb09348-fa11-4c68-a158-25b27c64e4fc";
//        ValidatableResponse response=this.tweetAPIClient.getTweet(1309675790578135046l);
//// Verify that the tweet was successfully deleted
//        response.statusCode(200);
//        String actualTweet=response.extract().body().path("text");
//        org.junit.Assert.assertEquals(tweet,actualTweet);
//        System.out.println(actualTweet);
//        System.out.println(tweet);
//    }
//    @Test
//    public void testGetTweet9(){
//        String tweet="this is my first tweet";
//        ValidatableResponse response=this.tweetAPIClient.getTweet(1306042337739628544l);
//// Verify that the tweet was successfully deleted
//        response.statusCode(200);
//        String actualTweet=response.extract().body().path("text");
//        org.junit.Assert.assertEquals(tweet,actualTweet);
//        System.out.println(actualTweet);
//        System.out.println(tweet);
//    }
//
//
//
//    @Test
    public void testLookUpTweet() {
        String tweet = "updating my second tweet";
        ValidatableResponse response = this.tweetAPIClient.lookUpTweet(1309678467030675459l, 1309901846874648584l, 1309901854097235980l);
// Verify that the tweet was successfully deleted
        response.statusCode(200);
        String actualTweet = response.extract().body().path("text");
        org.junit.Assert.assertEquals(tweet, actualTweet);
        System.out.println(actualTweet);
        System.out.println(tweet);
    }


}

