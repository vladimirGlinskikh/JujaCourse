<#import "/spring.ftl" as spring/>

<html>
<head>
    <title>Add Person</title>
    <link rel="stylesheet"
          type="text/css" href="<@spring.url '/style/my.css'/>"/>
</head>
<body>
<#if errorMessage??>
    <div style="color:red;font-style:italic;">
        ${errorMessage}
    </div>
</#if>

<div>
    <fieldset>
        <legend>Add Person</legend>
        <form name="person" action="" method="POST">
            First Name: <@spring.formInput "personForm.firstName" "" "text"/> <br/>
            Last Name: <@spring.formInput "personForm.lastName" "" "text"/> <br/>
            <input type="submit" value="Create"/>
        </form>
    </fieldset>
</div>


</body>

</html>