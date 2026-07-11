import { Tabs } from "expo-router";
import TabIcon from '~/components/tabs/TabIcon';
import TabLabel from "~/components/tabs/TabLabel";

const configTabs = [
  { name: "index", title: "Home", icon: "home" },
  { name: "search", title: "Search", icon: "search" },
  { name: "saved", title: "Saved", icon: "heart" },
  { name: "profile", title: "Profile", icon: "person" }
];

const _layout = () => {
  return (
    <Tabs>
      {configTabs.map(tab => (
        <Tabs.Screen
          key={tab.name}
          name={tab.name}
          options={{
            title: tab.title,
            headerShown: false,
            tabBarLabel: ({ focused }) => <TabLabel tab={tab} focused={focused} />,
            tabBarIcon: ({ focused }) => <TabIcon tab={tab} focused={focused} />,
            tabBarStyle: {
              height: 60,
              backgroundColor: "#111",
              borderTopWidth: 0
            },
          }}
        />
      ))}
    </Tabs>
  );
};

export default _layout;
