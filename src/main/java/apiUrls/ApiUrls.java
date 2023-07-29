package apiUrls;

import Enums.Location;
import Enums.Variables;

import static Enums.Location.*;
import static Enums.Variables.DailyParam;
import static Enums.Variables.HourlyParam;

public class ApiUrls {

    //this class will maintain the urls and endpoints each module wise.


    //defining base url
    public static String base_Url = "https://api.open-meteo.com/v1/forecast?";

    //Location wise url - hourly
    public static String get_GenericHourly_Auckland_Url = base_Url+"latitude="+ AKLLocationLatitude.getValue() +"&longitude="+ AKLLocationLongitude.getValue()+"&"+ HourlyParam.getVariables();
    public static String get_GenericHourly_Wellington_Url = base_Url+"latitude="+WLGLocationLatitude.getValue()+"&longitude="+WLGLocationLongitude.getValue()+"&"+HourlyParam.getVariables();
    //Location wise url - daily
    public static String get_GenericDaily_Auckland_Url = base_Url+"latitude="+ AKLLocationLatitude.getValue()+"&longitude="+ AKLLocationLongitude.getValue()+"&"+DailyParam.getVariables();
    public static String get_GenericDaily_Wellington_Url = base_Url+"latitude="+WLGLocationLatitude.getValue()+"&longitude="+WLGLocationLongitude.getValue()+"&"+DailyParam.getVariables();

}
