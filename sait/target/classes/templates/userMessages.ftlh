<#import "parts/common.ftlh" as c>

<@c.page>


<#if isCurrentUser>
<#include "parts/messageEdit.ftlh" />
</#if>

<#include "parts/messageListt.ftlh" />

</@c.page>