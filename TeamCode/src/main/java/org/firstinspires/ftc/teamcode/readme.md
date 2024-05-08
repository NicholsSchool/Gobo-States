        NOTES:
Find offsets of the arm, store in ArmConstants. Put in as Arm parameter

        CODE CHANGES:

    //FOR THIS COMPETITION
find right plane launching height                               [TODO]
Remove field oriented d-pad for operator                        [TODO]
add nudge                                                       [TODO]
Add autos and one for judging room                              [TODO]

    //FOR NEXT COMPETITION
Add more arm height selections                                  [TODO]

Fix odometry, completely non-functional                         [TODO]

Add Potentiometer Switch for choosing l/r column in auto        [TODO]

Spline Drivetrain pointer works??? (change both if not)         [TODO]
More honest spline distance estimates in both                   [TODO]

Add Kalman filter for continuous April Tags?                    [TODO]
Pixel Recognition?                                              [TODO]

            CLASS TESTING:
Fully Test Controllers                  [FINISHED]
Fully Test Angles                       [FINISHED]
Fully Test Point                        [FINISHED]
Fully Test Vector                       [FINISHED]
Fully Test RobotPose                    [FINISHED]
Fully Test MotionProfile                [FINISHED]
Fully Test PointMotionProfile           [FINISHED]
Fully Test SimpleFeedbackController     [FINISHED]
Fully Test FeedbackController           [FINISHED]
Fully Test ParabolicSpline              [TODO]
Fully Test BezierSpline                 [TODO]
Fully Test Hand                         [FINISHED]
Fully Test Lights                       [FINISHED]
Fully Test AprilTagVision               [FINISHED]
Fully Test TensorFlowVision             [FINISHED]
Fully Test Arm                          [FINISHED]
Fully Test Drivetrain                   [TODO]

            CONSTANTS TUNING:
ArmConstants - tune PlaneLauncher range         [FINISHED]
ArmConstants - tune shoulder max power          [FINISHED]
ArmConstants - tune shoulder p                  [FINISHED]
ArmConstants - tune shoulder vertical p         [FINISHED]
ArmConstants - tune arm vertical position       [FINISHED]
ArmConstants - tune wrist max power             [FINISHED]
ArmConstants - tune wrist p                     [FINISHED]
ArmConstants - tune wrist fourbar positions     [FINISHED]
ArmConstants - tune fourbar switching angle     [FINISHED]
ArmConstants - tune arm set positions           [TODO]

ControllerConstants - tune deadband             [FINISHED]
ControllerConstants - tune wait time            [FINISHED]

DrivetrainConstants - Tune Profile Speeds       [FINISHED]
DrivetrainConstants - Tune Turning Max          [FINISHED]
DrivetrainConstants - Tune virtual gears        [FINISHED]
DrivetrainConstants - Tune auto align p         [FINISHED]
DrivetrainConstants - Tune auto align error     [FINISHED]
DrivetrainConstants - tune Drive Motor FF       [FINISHED]
DrivetrainConstants - Tune odometry corrections [TODO]

HandConstants - tune all Grabber ranges         [FINISHED]

SplineConstants - Tune Spline P                 [TODO]
SplineConstants - Tune Spline error             [TODO]
SplineConstants - Tune ALL waypoints            [TODO]
SplineConstants - Make and Tune Bezier Values   [TODO]

VisionConstants - tune camera offsets           [FINISHED]
VisionConstants - tune BOTH thresholds          [FINISHED]