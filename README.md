# restfulBookerGatling

Tests based on free API from https://restful-booker.herokuapp.com/apidoc/index.html <br />
Gatling used in open source version <br />
Is an example of a very simple performance test.<br />
The simulation is started with a command 
```
-clean scala:compile gatling:test -Dgatling.simulationClass.SimulationUser
```
Results can be found in\restfulbookergatling\target\gatling\simulationuser<br />

![image](https://github.com/anniab/restfulBookerGatling/assets/73132236/7a697ee5-d127-4058-b620-8ba9b4a1ef98)<br />
In the Report there are exact statistics from the tests, statistics from a requests simulation can also be found in the simulation.log file<br />

it's important to know that:<br />
<ul>
<li>The API https://restful-booker.herokuapp.com/apidoc/index.html is not stable</li>
<li>The stress test approach is very simplified for this API</li>
<li>There is no distinction based on the type of request, which would be the case under production conditions</li>
<li>No additional elements such as assertions, etc</li>
 </ul>

How could these tests be extended?<br />
<ul>
<li>business scenario could be introduced</li>
<li>differentiate the approach to the test due to the type of POST / GET method</li>
<li>add additional elements, such as assertions</li>
</ul>
