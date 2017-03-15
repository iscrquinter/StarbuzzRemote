package testAll;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import testc.TDarkRoastWithMilk;
import testc.TDecafWithMocha;
import testc.THouseBlendWithSoy;

@RunWith(Suite.class)
@SuiteClasses({ TDarkRoastWithMilk.class, TDecafWithMocha.class, THouseBlendWithSoy.class })
public class AllTestsC {

}
