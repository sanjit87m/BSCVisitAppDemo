//package org.molina.com.molina;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//
///**
// * Created by sanjit on 08/10/18.
// */
//
//public class ExpandableListDataPump {
//    public static  HashMap<String, HashMap<String, List<String>>> getData() {
//        HashMap<String, HashMap<String, List<String>>> expandableListDetail = new HashMap<String, HashMap<String, List<String>>>();
//
//
//        List<String> infosysTeamMolina = new ArrayList<String>();
//        infosysTeamMolina.add("PPT");
//
//        HashMap<String, List<String>> introductions = new HashMap<String, List<String>>();
//        introductions.put("Infosys Team for Molina",infosysTeamMolina);
//
//
//        //Infrastructure
//        List<String> infraStructure = new ArrayList<String>();
//        infraStructure.add("PPT");
//        infraStructure.add("Demo");
//
//        HashMap<String, List<String>> techinicalInfraSolution = new HashMap<String, List<String>>();
//        techinicalInfraSolution.put("Infrastructure",infraStructure);
//
//
//
//
//
//
//        //End-User Services
//        List<String> endUserService = new ArrayList<String>();
//        endUserService.add("PPT");
//        techinicalInfraSolution.put("End-User Services",endUserService);
//
//        //Non-Labor Sourcing
//        List<String> nonLabourSorucing = new ArrayList<String>();
//        nonLabourSorucing.add("PPT");
//        techinicalInfraSolution.put("Non-Labor Sourcing",nonLabourSorucing);
//
//        //Application Development
//        List<String> applicationDev = new ArrayList<String>();
//        applicationDev.add("PPT");
//        applicationDev.add("Demo");
//        techinicalInfraSolution.put("Application Development",applicationDev);
//
//        //Application Testing
//        List<String> applicatioTesting = new ArrayList<String>();
//        applicatioTesting.add("PPT");
//        techinicalInfraSolution.put("Application Development",applicatioTesting);
//
//        //Application Support
//        List<String> applicatioSupport = new ArrayList<String>();
//        applicatioSupport.add("PPT");
//        applicatioSupport.add("Demo");
//        techinicalInfraSolution.put("Application Development",applicatioSupport);
//
//        //Transition
//        HashMap<String, List<String>> transition = new HashMap<String, List<String>>();
//        List<String> transitionType = new ArrayList<String>();
//        transitionType.add("PPT");
//        transition.put("Transition",transitionType);
//
//        //Solution Summary and Transition
//        HashMap<String, List<String>> solutionSummaryTransition = new HashMap<String, List<String>>();
//
//        //Executive Summary
//        List<String> executiveSummary = new ArrayList<String>();
//        executiveSummary.add("PPT");
//        solutionSummaryTransition.put("Executive Summary",executiveSummary);
//
//        //Optimizing Keeping the Lights On Activity
//        List<String> optimizing = new ArrayList<String>();
//        optimizing.add("PPT");
//        solutionSummaryTransition.put("Optimizing Keeping the Lights On Activity",optimizing);
//
//        //Transformation opportunities and approach
//        List<String> transformation = new ArrayList<String>();
//        transformation.add("PPT");
//        transformation.add("Demo");
//        solutionSummaryTransition.put("Transformation opportunities and approach",transformation);
//
//        //Client case studies and result achieved
//        List<String> client = new ArrayList<String>();
//        client.add("PPT");
//        solutionSummaryTransition.put("Transformation opportunities and approach",client);
//
//        //About Infosys
//        HashMap<String, List<String>> aboutInfosys = new HashMap<String, List<String>>();
//
//        //Infosys Background
//        List<String> infosysBackground = new ArrayList<String>();
//        infosysBackground.add("PPT");
//        infosysBackground.add("Video");
//        aboutInfosys.put("Transformation opportunities and approach",infosysBackground);
//
//        //Customer Testimonials
//        List<String> customerTestimonials = new ArrayList<String>();
//        customerTestimonials.add("Video");
//        aboutInfosys.put("Transformation opportunities and approach",customerTestimonials);
//
//
//
//
//
//
//
////        List<String> introductions = new ArrayList<String>();
////        cricket.add("India");
////        cricket.add("Pakistan");
////        cricket.add("Australia");
////        cricket.add("England");
////        cricket.add("South Africa");
////
////        List<String> football = new ArrayList<String>();
////        football.add("Brazil");
////        football.add("Spain");
////        football.add("Germany");
////        football.add("Netherlands");
////        football.add("Italy");
////
////        List<String> basketball = new ArrayList<String>();
////        basketball.add("United States");
////        basketball.add("Spain");
////        basketball.add("Argentina");
////        basketball.add("France");
////        basketball.add("Russia");
//
//        expandableListDetail.put("Introductions", introductions);
//        expandableListDetail.put("Technical Infra Solution Deep Dive & Sub-Tower Transformation", techinicalInfraSolution);
//        expandableListDetail.put("Transition", transition);
//        expandableListDetail.put("Solution Summary and Transformation", solutionSummaryTransition);
//        expandableListDetail.put("About Infosys", aboutInfosys);
//
//        return expandableListDetail;
//    }
//
//
//
//    /*
//     * Preparing the list data
//     */
//    private void prepareListData() {
//        listDataHeader = new ArrayList<String>();
//        listDataChild = new HashMap<String, List<String>>();
//
//        // Adding child data
//        listDataHeader.add("Top 250");
//        listDataHeader.add("Now Showing");
//        listDataHeader.add("Coming Soon..");
//
//        // Adding child data
//        List<String> top250 = new ArrayList<String>();
//        top250.add("The Shawshank Redemption");
//        top250.add("The Godfather");
//        top250.add("The Godfather: Part II");
//        top250.add("Pulp Fiction");
//        top250.add("The Good, the Bad and the Ugly");
//        top250.add("The Dark Knight");
//        top250.add("12 Angry Men");
//
//        List<String> nowShowing = new ArrayList<String>();
//        nowShowing.add("The Conjuring");
//        nowShowing.add("Despicable Me 2");
//        nowShowing.add("Turbo");
//        nowShowing.add("Grown Ups 2");
//        nowShowing.add("Red 2");
//        nowShowing.add("The Wolverine");
//
//        List<String> comingSoon = new ArrayList<String>();
//        comingSoon.add("2 Guns");
//        comingSoon.add("The Smurfs 2");
//        comingSoon.add("The Spectacular Now");
//        comingSoon.add("The Canyons");
//        comingSoon.add("Europa Report");
//
//        listDataChild.put(listDataHeader.get(0), top250); // Header, Child data
//        listDataChild.put(listDataHeader.get(1), nowShowing);
//        listDataChild.put(listDataHeader.get(2), comingSoon);
//    }
//}
//}
