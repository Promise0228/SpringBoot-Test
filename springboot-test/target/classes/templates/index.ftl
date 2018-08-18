hello freemark!!!<br>
${name}

<#if sex==1>
男
<#elseif sex==0>
女
<#else>
未选择
</#if>

<br>


<#list  userlist as user>
		${user}
</#list>