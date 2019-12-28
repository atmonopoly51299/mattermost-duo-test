<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>Run_all_test_cases</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <testSuiteGuid>f8ae07e1-687a-466a-b610-2cb857d73b10</testSuiteGuid>
   <testCaseLink>
      <guid>4300b809-ee9a-4e7e-885e-3704addcb461</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/1_Create_Team/New_Team (success case)</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>be7a7d78-44e9-4391-9dea-0f3e7c468247</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/1_Create_Team/Empty_Name</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>ecf8ae17-de58-4f1e-9550-80669c59b366</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/1_Create_Team/Existed_Team_Name</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>ff1b9bee-1080-4ea0-9010-86e8f584e274</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/1_Existed_Team_Name</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>ff1b9bee-1080-4ea0-9010-86e8f584e274</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>exist_team_name</value>
         <variableId>84ef91eb-a811-43bc-9640-9e4529f9114c</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>c5c3ffec-faf4-4877-b345-2fd669b3cb41</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/1_Create_Team/More_Than_15_Char</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>dca0c17a-ec7d-4236-aef3-fc109138e991</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/2_More_Than_15_Char</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>dca0c17a-ec7d-4236-aef3-fc109138e991</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Team_name</value>
         <variableId>a690abdb-c10b-49e6-9447-b311621b1cd9</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>2af1db89-5b3f-4d8a-a6de-783cf60db76b</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/2_Create_Channel/Public_Channel</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>a150d00c-4b2d-463f-9733-3ea1b9a4c707</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/2_Create_Channel/Private_Channel</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>d84c4b1c-b6df-4e0c-9ab2-adf4f9c1b296</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/2_Create_Channel/Existing_Channel_Name</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>9da83e42-a01b-4953-a2dd-ff565b527a45</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/2_Create_Channel/Cancel_Create_Channel</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>47836a55-c9ec-4816-b52e-c54f360cd631</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/3_Edit_Channel/Edit_Channel_Header</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>01ed3062-db2a-48c4-a910-288664409261</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/3_Edit_Channel_Header</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>01ed3062-db2a-48c4-a910-288664409261</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Channel_header</value>
         <variableId>0ca181fa-bcb1-43ce-840c-c050edf59777</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>86156076-fd01-42fd-b405-b7853c82d24b</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/3_Edit_Channel/Edit_Channel_Purpose</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>9aea6f44-1aab-4532-91a1-5e8ac933fb55</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/3_Edit_Channel/Rename_Channel</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>d5e2ccd1-6d7c-46c1-b16c-6ee5eb762c38</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/3_Edit_Channel/View_Channel_Info</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>ace8ea04-07c3-4209-9989-0df114e9dd11</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/3_Edit_Channel/Mute_Channel</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>57beda76-3f30-49a0-92db-f97d925eed0c</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/3_Edit_Channel/Ignore_Mentions_For_Channels</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>fa76c698-2ad4-4081-afc8-c2f9333edbfd</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/3_Edit_Channel/Send_Channel_Desktop_Notifications_(For_all_activity)</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>bf21fcd1-0560-4a10-9eaf-86dfe7183df2</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/5_Manage_Team_Members/Get_Team_Invite_Link</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>b9d2f03c-fe9a-4b77-a6ae-8d3cd7830b5f</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/5_Manage_Team_Members/Invite_New_Member_To_Team</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>8ce02e0f-c7bc-4803-b13c-c1a32d4b71bc</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/5_Manage_Team_Members/View_Members_In_Team</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>a757f12a-8631-4143-8443-04c86fc53164</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/6_Team_Settings/Allow_Any_Join_Team</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>efe6a186-67de-42b8-9df2-4918e0e20468</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/6_Team_Settings/Allow_Join_Team</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>78c558c1-a4f6-49a3-8d7f-009634d17231</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/6_Team_Settings/Edit_Invite_Code</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>3403d9a6-ac37-4ce2-a824-e2132fabafd8</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/6_Team_Settings/Edit_Team_Description</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>287c2c9b-2dc3-42df-83bf-41514da33cff</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/6_Team_Settings/Edit_Team_Name</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>84a64de0-1254-412f-8356-901b8b261db9</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/7_Account_Settings/Edit_Desktop_Notification</testCaseId>
   </testCaseLink>
</TestSuiteEntity>
