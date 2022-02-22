//try
package sample; 
/*
 * Copyright 2014 - 2017 Cognizant Technology Solutions
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


import com.cognizant.cognizantits.datalib.or.ObjectRepository;
import com.cognizant.cognizantits.datalib.or.common.ObjectGroup;
import com.cognizant.cognizantits.datalib.or.web.WebORObject;
import com.cognizant.cognizantits.datalib.or.web.WebORPage;
import com.cognizant.cognizantits.engine.commands.General;
import com.cognizant.cognizantits.engine.core.CommandControl;
import com.cognizant.cognizantits.engine.core.Control;
import com.cognizant.cognizantits.engine.support.Status;
import com.cognizant.cognizantits.engine.support.methodInf.Action;
import com.cognizant.cognizantits.engine.support.methodInf.ObjectType;
import com.cognizant.cognizantits.engine.support.methodInf.InputType;

public class SampleScript extends General {

    public SampleScript(CommandControl cc) {
        super(cc);
    }

    @Action(desc = "Description of the method", input = InputType.NO)
    public void yourCustomMethod() {
        //To Do. Put your code here
        Report.updateTestLog(Action, Description, Status.DONE);
    }

    @Action(object = ObjectType.SELENIUM)
    public void youCustomMethod2() {
        if (Element.getText().equals("Something")) {
            Report.updateTestLog(Action, "Element text matched with Something", Status.PASS);
        } else {
            Report.updateTestLog(Action, "Error in action", Status.FAIL);
        }
    }
    
    @Action(object = ObjectType.BROWSER, desc = "Set frame for a page. Fill <@PageName> in Input and <FrameName> in Condition", input = InputType.YES, condition = InputType.YES)
    public void setPageFrame() {
    	String PageName = Data;
    	String FrameName = Condition;
    	ObjectRepository objRep = Control.getCurrentProject().getObjectRepository();
    	WebORPage wPage = objRep.getWebOR().getPageByName(PageName);
    	for (ObjectGroup<WebORObject> objectgroup : wPage.getObjectGroups()) {
    		AObject.getWebObject(PageName, objectgroup.getName()).setFrame(FrameName);
    	}
       
    }
	
	@Action(object = ObjectType.SELENIUM, desc = "Set frame for a page. Fill <@ElementXpath> in Input.It will switch to that frame ", input = InputType.YES)
    public void setPageFrameByElement() {
    	String ElementXpath = Data;
    	
    	int totalFrames=object.findElements(By.tagName("iframe")).size();
		int iframeValue=0;
		
		for(int i=0; i<=totalFrames;i++)
		{
			object.switchTo().frame(i);
			int elementFound=object.findElements(By.xpath(ElementXpath)).size();
			
			if(elementFound==1)
			{
				iframeValue=i;
				break;
			}
			
			object.switchTo().defaultContent();
		}
		object.switchTo.frame(iframeValue);
		Report.updateTestLog(Action, Description, Status.DONE);
       
    }
    
}
