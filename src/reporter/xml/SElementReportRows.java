/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reporter.xml;

import sa.lib.xml.SXmlElement;

/**
 *
 * @author Alfredo Pérez
 */
public class SElementReportRows extends SXmlElement {
    
    public static final String ELEMENT = "Rows";
    
    /**
     * Creates a Template.Report.Rows node.
     * Can contain Template.Report.Rows.Row nodes.
     */
    public SElementReportRows() {
        super(ELEMENT);
    }
}
