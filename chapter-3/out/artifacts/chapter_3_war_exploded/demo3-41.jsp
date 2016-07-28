<%@ page language="java" pageEncoding="UTF-8"%>
<html>

    <head>
        <title>baidu</title>

        <script language="JavaScript">
            var elementList = "";
            function getElement(node) {
                var total = 0;
//                if (node.nodeType == 1){
//                    total ++;
//                    elementList = elementList + node.nodeName + "、";
//                }

                total ++;
                elementList = elementList + node.nodeName + "、";

                var nodeChildList = node.childNodes;
                for (var nodeChild in nodeChildList){
                    total += getElement(nodeChild);
                }
                return total;
            }

            function show() {
                var number = getElement(document);
                alert("the element list:" + elementList + "\n" +
                        "the number is :" + number
                );
                elementList = "";
            }
        </script>
    </head>

    <body onload="show()">
    百度!-〉<br>
    <a href="http://www.baidu.com">www.baidu.com</a><br>
    </body>

</html>