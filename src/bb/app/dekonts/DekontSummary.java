/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bb.app.dekonts;

import java.util.ArrayList;

/**
 *
 * @author esabil
 */
public class DekontSummary
{
    public ArrayList<DekontSummaryTots>           banks    = new ArrayList<DekontSummaryTots>();
    public ArrayList<DekontSummaryRec>            rows     = new ArrayList<DekontSummaryRec>();
    public ArrayList<DekontSummaryYear>           years    = new ArrayList<DekontSummaryYear>();

    // Quarter Days & Weeks
    //-------------------------------------------------------------------------------
    public ArrayList<DekontSummaryQuarterDay>     Qdays     = new ArrayList<DekontSummaryQuarterDay>();
    public ArrayList<DekontSummaryQuarterWeek>   Qweeks    = new ArrayList<DekontSummaryQuarterWeek>();

    // All Weeks  (52 Weeks)
    //-------------------------------------------------------------------------------
    public ArrayList<DekontSummaryWeek>            weeks   = new ArrayList<DekontSummaryWeek>();

    // Current Year
    //-------------------------------------------------------------------------------
    public DekontSummaryThisYear                current  = new DekontSummaryThisYear();//Current Year

    // Overall (years)
    //-------------------------------------------------------------------------------
    public ArrayList<DekontSummaryYear> overall = new ArrayList<DekontSummaryYear>();//years
    
    public DekontSummaryUseRates useRates = new DekontSummaryUseRates();
    
    //Current Month
    //-------------------------------------------------------------------------------
    public DekontSummaryMonth currentMonth = new DekontSummaryMonth();
    
    // Target Month Weeks
    //-------------------------------------------------------------------------------
    public ArrayList<DekontSummaryWeek>            MonthNweeks   = new ArrayList<DekontSummaryWeek>();

    // Target Month Weeks
    //-------------------------------------------------------------------------------
    
    
    public String baseYear = "";
    
    public String targetMonth = "";
}
