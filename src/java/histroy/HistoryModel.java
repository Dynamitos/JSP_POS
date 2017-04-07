/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package histroy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Shit
 */
public class HistoryModel
{
    private List<HistoryBean> l = new ArrayList<>();
    
    public void add(HistoryBean b)
    {
        l.add(b);
    }

    public List<HistoryBean> getL()
    {
        return l;
    }
    
    
            
}
